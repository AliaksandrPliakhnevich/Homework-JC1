package JC1.Homework.Homework8;

public class Main {

    public static void main(String[] args) {
        // на вход в main даем ссылки на корневую директорию, 
        // директорию резервной копии, файл логера
        new Menu(args[0], args[1], args[2]).start();
    }
}