package DataMakeup;

public class Node {
    private Object data;
    private Node node;
    private Node nextNode;

    public Node() {
        data = null;
        nextNode = null;
    }

    public Node(Object data) {
        this.data = data;
        nextNode = null;
    }
    public void Link(Node next){
        nextNode = next;
    }
    public Object getData(){
        return data;
    }
}
