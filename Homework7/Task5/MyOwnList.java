package JC1.Homework.Homework7.Task5;

public class MyOwnList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    public MyOwnList() {
    }

    public void add(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextElement(node);
            tail = node;
        }
        size++;
        // исправил, добавил tail, последний элемент не будет иметь ссылки на
        // следующий, добавляем новые элементы сразу в конец
        
        /**
         * NOTE! Если оставить этот метод так, как есть, то твой лист будет
         * иметь обратный порядок добавленных элементов. То есть Если я добавлю
         * 1 2 3, то он будет содержать 3 2 1. Тут надо было сделать метод
         * поиска последнего элемента списка и в него устанавливать твой
         * newElement
         */
//        Node<T> newElement = new Node<>(t);
//        newElement.setNextElement(head);
//        head = newElement;
//        size++;
    }

    public void addDataByIndex(int index, T t) {
        /**
         * NOTE! Считается не очень круто не проверять данные на ошибки. У тебя
         * тут можно обойтись без try-catch и использовать if
         */
        // исправил, ввел проверку на index, чтобы был меньше размера списка
        if (index < size) {
            Node<T> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNextElement();
            }
            temp.setData(t);
        } else {
            System.out.println("Количество элементов в списке меньше введенного индекса");
        }

    }

    public T getDataByIndex(int index) {
        /**
         * NOTE! Считается не очень круто не проверять данные на ошибки. У тебя
         * тут можно обойтись без try-catch и использовать if
         */
        // исправил, ввел проверку на index, чтобы был меньше размера списка
        if (index < size) {
            Node<T> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNextElement();
            }
            return temp.getData();
        }
        System.out.println("Количество элементов в списке меньше введенного индекса");
        return null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node<T> temp = head;
        String str = "";
        while (true) {
            if (temp.getNextElement() == null) {
                str += temp.getData() + " ";
                break;
            } else {
                str += temp.getData() + " ";
                temp = temp.getNextElement();
            }
        }
        return "MyOwnList:\n" + str + "\nsize: " + this.size + "\n";
    }

}
