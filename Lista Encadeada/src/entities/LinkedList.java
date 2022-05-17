package entities;

public class LinkedList<Type> {

    private Node<Type> root;

    public LinkedList() {
        this.root = null;
    }

    public void add(Type value){
        Node<Type> newNode = new Node<>(value);
        if (this.isEmpty()){
            root = newNode;
            return;
        }

        Node<Type> auxNode = root;
        for (int i = 0; i < this.size()-1; i++){
            auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(newNode);
    }

    public Type remove(int index){
        Node<Type> removeNode = this.getNode(index);
        if (index == 0) {
            root = removeNode.getNextNode();
            return  removeNode.getContent();
        }

        Node<Type> previousNode = getNode(index - 1);
        previousNode.setNextNode(removeNode.getNextNode());
        return removeNode.getContent();
    }

    public Type get(int index){
        return getNode(index).getContent();
    }

    private Node<Type> getNode(int index){
        if (index >= this.size()) throw  new IndexOutOfBoundsException("There is no content in the index " + index);

        Node<Type> auxNode = root;
        Node<Type> returnNode = null;

        for (int i = 0; i <= index; i++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }

        return returnNode;
    }

    public int size(){
        int listSize = 0;
        Node<Type> auxNode = root;
        while (auxNode != null) {
             listSize++;
             if (auxNode.getNextNode() != null){
                 auxNode = auxNode.getNextNode();
             }
        }
        return listSize;
    }

    public boolean isEmpty(){
        return root == null ? true : false;
    }

    @Override
    public String toString() {
        String str = "";
        Node<Type> auxNode = root;
        for (int i = 0; i < this.size(); i++){
            str += "Node{" + auxNode.getContent() + "}-->";
            auxNode = auxNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
