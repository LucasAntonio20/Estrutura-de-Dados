package entities;

public class Node<Type> {

    private String content;
    private Node<Type> next;

    public Node() {
    }

    public Node(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
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
        return content.toString();
    }

}
