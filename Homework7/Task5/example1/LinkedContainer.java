package JC1.Homework.Homework7.Task5.example1;

public class LinkedContainer<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedContainer() {
        this.lstNode = new Node<>(null, fstNode, null);
        this.fstNode = new Node<>(null, null, lstNode);
    }
    
    public void addLast(E e){
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }
    
    public void addFirst(E e){
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<E>(null, null, next);
        next.setPrevElement(fstNode);
        size++;
    }
    
    public E getElementByIndex(int counter){
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }
    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }
    
}
