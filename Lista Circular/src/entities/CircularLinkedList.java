package entities;

public class CircularLinkedList<Type> {

    private Node<Type> head;
    private Node<Type> tail;
    private int listSize;

    public CircularLinkedList() {
        tail = null;
        head = null;
        listSize = 0;
    }

    public void remove (int index){
        if (index >= this.listSize) throw new IndexOutOfBoundsException("index bigger then list size");

        Node<Type> auxNode = tail;
        if (index == 0){
            this.tail = this.tail.getNext();
            head.setNext(tail);
        }else if(index == 1){
            tail.setNext(tail.getNext().getNext());
        }else {
            for (int i = 0; i < index-1; i++) {
                auxNode = auxNode.getNext();
            }
            auxNode.setNext(auxNode.getNext().getNext());
        }
    }

    public void add(Type content){
        Node<Type> newNode = new Node<>(content);
        if (this.isEmpty()){
            head = newNode;
            tail = head;
            head.setNext(tail);
        }else {
            newNode.setNext(tail);
            head.setNext(newNode);
            tail = newNode;
        }
        listSize++;
    }

    public Type get(int index){
        return this.getNode(index).getContent();
    }

    private Node<Type> getNode(int index){
        if (this.isEmpty()) throw new IndexOutOfBoundsException("Empty list");

        if (index == 0)
            return this.tail;

        Node<Type> auxNode = tail;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.getNext();
        }
        return auxNode;
    }

    public boolean isEmpty(){
        return listSize == 0 ? true : false;
    }

    public int size(){
        return this.listSize;
    }

    @Override
    public String toString() {
        String str = "";
        Node<Type> auxNode = tail;
        for (int i = 0; i < this.size(); i++) {
            str += "[" + auxNode.getContent()+"]-->";
            auxNode = auxNode.getNext();
        }
        str += !isEmpty() ? "Return init" : "";
        return str;
    }
}
