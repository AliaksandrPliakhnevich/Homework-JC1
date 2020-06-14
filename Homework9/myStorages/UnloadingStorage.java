package JC1.Homework.Homework9.myStorages;

import java.util.ArrayList;
import java.util.List;

public class UnloadingStorage {

    private volatile List<String> storage;

    public UnloadingStorage(int storageSize) {
        this.storage = new ArrayList<>(storageSize);
    }

    public List<String> getUnloadingStorage() {
        return storage;
    }

    @Override
    public String toString() {
        String res = "";
        for (String element: storage){
            res += "\"" + element + "\"" + " ";
        }
        return "Склад разгрузки: " + res;
    }

}
