package entities;

public class Node<Type> {

    private Type content;
    private Node<Type> nextNode;

    public Node() {
        nextNode = null;
    }

    public Node(Type content) {
        this.content = content;
        nextNode = null;
    }

    public Node(Type content, Node<Type> nextNode) {
        this.content = content;
        this.nextNode = nextNode;
    }

    public Type getContent() {
        return content;
    }

    public void setContent(Type content) {
        this.content = content;
    }

    public Node<Type> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<Type> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "[" + content + ']';
    }

    public String toStringLinked(){
        String str = "[" + content + ']';

        if (nextNode != null){
            str += "->" + nextNode.toString();
        }else{
            str += "->null";
        }

        return str;
    }
}
