package JC1.Homework.Homework7.Task5;

public class Main {

    public static void main(String[] args) {
        MyOwnList<String> testList = new MyOwnList<>();
        testList.add("0");
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");
        System.out.println(testList.toString());
        testList.addDataByIndex(4, "Hello");
        testList.addDataByIndex(5, "World!");
        System.out.println(testList.toString());
        System.out.println(testList.getDataByIndex(5));
    }

}
