package JC1.Homework.Homework9.сars;

import JC1.Homework.Homework9.myStorages.LoadingStorage;
import JC1.Homework.Homework9.myStorages.UnloadingStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Truck extends Thread {

    private final int capacity;
    private final String name;
    private final LoadingStorage loadingStorage;
    private final UnloadingStorage unloadingStorage;
    private final ReentrantLock locker;
    private final List<String> cargo;

    public Truck(int capacity, String name, LoadingStorage loadingStorage,
            UnloadingStorage unloadingStorage, ReentrantLock locker) {

        this.capacity = capacity;
        this.name = name;
        this.loadingStorage = loadingStorage;
        this.unloadingStorage = unloadingStorage;
        cargo = new ArrayList<>(capacity);
        this.locker = locker;
    }

    @Override
    public void run() {
        try {
            locker.lock();
            loading(loadingStorage);
            transportation();
            unloading();
        } finally {
            locker.unlock();
        }
    }

    private void loading(LoadingStorage storage) {
        System.out.println("Началась загрузка грузовика " + name);
        for (int i = 0; i < capacity; i++) {
            try {
                if (storage.getStorage().isEmpty()) {
                    break;
                }
                cargo.add(storage.getProductUnit());
                sleep(2000);
                System.out.println("В грузовик " + name + " загружен товар: " + cargo.get(i));
            } catch (InterruptedException ex) {
                System.out.println("В грузовик " + name + " не загружен товар");
                ex.printStackTrace();
            }
        }
        System.out.println("Окончена загрузка грузовика " + name);
    }

    private void transportation() {
        try {
            System.out.println("Грузовик " + name + " отправился на склад разгрузки");
            sleep(5000);
            System.out.println("Грузовик " + name + " прибыл на склад разгрузки");
        } catch (InterruptedException ex) {
            System.out.println("Перевозка грузовиком " + name + " не состоялась");
            ex.printStackTrace();
        }
    }

    private void unloading() {
        for (int i = 0; i < capacity; i++) {
            try {
                if (cargo.isEmpty()) {
                    break;
                }
                System.out.println("Из грузовика " + name + " разгружается товар: " + cargo.get(0));
                unloadingStorage.getUnloadingStorage().add(cargo.remove(0));
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Разгрузка грузовика " + name + " не произошла");
                ex.printStackTrace();
            }
        }
        System.out.println("Окончена разгрузка грузовика " + name);
    }

}
