package JC1.Homework.Homework9.myStorages;

import java.util.ArrayList;
import java.util.List;

public class LoadingStorage {

    private volatile List<String> storage;

    public LoadingStorage(int storageSize) {
        this.storage = new ArrayList<>(storageSize);
        for (int i = 0; i < storageSize; i++) {
            storage.add("Box #" + i);
        }
    }

    public List<String> getStorage() {
        return storage;
    }

    public String getProductUnit() {
        if (!storage.isEmpty()) {
            return storage.remove(0);
        }
        System.out.println("Со склада не получен товар");
        return null;
    }

    @Override
    public String toString() {
        String res = "";
        for (String element : storage) {
            res += "\"" + element + "\"" + " ";
        }
        return "Склад отгрузки: " + res;
    }
}
