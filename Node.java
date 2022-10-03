public class Node {

    private Baggage data;
    private Node next;
    private Node prev;

    public Node(Baggage data) {
        this.data = data;
       
    }

    public void setData(Baggage data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Baggage getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

}
