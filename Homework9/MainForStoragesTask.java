package JC1.Homework.Homework9;

import JC1.Homework.Homework9.myStorages.LoadingStorage;
import JC1.Homework.Homework9.myStorages.UnloadingStorage;
import JC1.Homework.Homework9.сars.Truck;
import static JC1.Homework.Homework9.сars.TruckNames.TRUCK_NAMES;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MainForStoragesTask {

    public static void main(String[] args) {
        List<LoadingStorage> loadingStorages = new ArrayList<>(5);
        loadingStorages.add(new LoadingStorage(10));
        loadingStorages.add(new LoadingStorage(10));
        loadingStorages.add(new LoadingStorage(10));
        loadingStorages.add(new LoadingStorage(10));
        loadingStorages.add(new LoadingStorage(10));

        UnloadingStorage unloadingStorage = new UnloadingStorage(50);

        for (LoadingStorage loadingStorage : loadingStorages) {
            System.out.println(loadingStorage.toString());
        }
        System.out.println(unloadingStorage.toString());

        ReentrantLock locker = new ReentrantLock();

        for (LoadingStorage loadingStorage : loadingStorages) {
            while (!loadingStorage.getStorage().isEmpty()) {
                for (int j = 0; j < 20 && !loadingStorage.getStorage().isEmpty(); j++) {
                    String truckName = TRUCK_NAMES[j];
                    Truck truck;
                    if (j < 5) {
                        truck = new Truck(1, truckName, loadingStorage, unloadingStorage, locker);
                    } else if (j >= 5 && j < 15) {
                        truck = new Truck(3, truckName, loadingStorage, unloadingStorage, locker);
                    } else if (j >= 15 && j < 20) {
                        truck = new Truck(5, truckName, loadingStorage, unloadingStorage, locker);
                    } else {
                        truck = null;
                    }
                    truck.start();
                    if (truck.isAlive()) {
                        try {
                            truck.join();
                            System.out.println(loadingStorage.toString());
                            System.out.println(unloadingStorage.toString());
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
