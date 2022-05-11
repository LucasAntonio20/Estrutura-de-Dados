package entities;

public class Stack<Type> {

    private Node<Type> root;

    public Stack() {
        root = null;
    }

    public void push(Node<Type> newNode){
        Node<Type> oldRoot = root;
        root = newNode;
        root.setNext(oldRoot);
    }

    public Node<Type> pop(){
        if (!this.isEmpty()){
            Node<Type> deletedNode = root;
            root = deletedNode.getNext();
        }
        return null;
    }

    public Node<Type> top(){
        return root;
    }

    public boolean isEmpty(){
        return root == null ? true : false;
    }

    public void showStack(){
        Node<Type> auxNode = root;
        while(auxNode != null){
            System.out.println(auxNode);
            auxNode = auxNode.getNext();
        }
    }
}
