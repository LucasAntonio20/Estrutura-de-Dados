package entities;

public class Node<Type> {

    private Type content;
    private Node<Type> next;

    public Node(Type content) {
        this.next = null;
        this.content = content;
    }

    public Type getContent() {
        return content;
    }

    public void setContent(Type content) {
        this.content = content;
    }

    public Node<Type> getNext() {
        return next;
    }

    public void setNext(Node<Type> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + content + ']';
    }
}
