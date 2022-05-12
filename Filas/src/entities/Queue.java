package entities;

public class Queue<Type> {

    private Node<Type> head;

    public Queue() {
        head = null;
    }

    public void showQueue(){
        Node<Type> auxNode = head;
        while(auxNode != null){
            System.out.println(auxNode);
            auxNode = auxNode.getNext();
        }
    }

    public Node<Type> first(){
        if (!this.isEmpty()){
            Node<Type> firstNode = head;
            while(true){
                if (firstNode.getNext() != null){
                    firstNode = firstNode.getNext();
                }else{
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node<Type> dequeue(){
        if (!this.isEmpty()){
            Node<Type> firstNode = head;
            Node<Type> auxNode = head;
            while(true){
                if (firstNode.getNext() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNext();
                }else{
                    auxNode.setNext(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public void enqueue(Node<Type> newNode){
        newNode.setNext(head);
        head = newNode;
    }

    public boolean isEmpty(){
        return head == null ? true : false;
    }
}
