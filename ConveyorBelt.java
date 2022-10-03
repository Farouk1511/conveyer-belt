public class ConveyorBelt {

    private Node headNode;
    private Node tailNode;
    private double totalWeight;
    private int totalVIP;
    private int totalREG;

    public void checkBag(Baggage data) {
        Node node = new Node(data);

        if (headNode == null) {
            headNode = node;
            tailNode = node;
            update(data);
            return;
        }
        // if VIP is not on the belt
        if (!headNode.getData().getIsVIP() && data.getIsVIP()) {
            headNode.setPrev(node);
            node.setNext(headNode);

            tailNode = headNode;
            headNode = node;
            update(data);
            return;
        }

        if (data.getIsVIP() && !tailNode.getData().getIsVIP()) {
            Node current = headNode;
    
           
            for (int i = 0; i < this.totalVIP; i++) {
                current = current.getNext();
            }
          

            Node prev = current.getPrev();
            if(prev != null){
                prev.setNext(node);
            }

            node.setNext(current);
            node.setPrev(prev);
            current.setPrev(node);

        }else if(tailNode.getData().getIsVIP() && data.getIsVIP()){
            tailNode.setNext(node);
            tailNode = node;
        }else {
        
            tailNode.setNext(node);
            node.setPrev(tailNode);

            tailNode = node;
        }

        update(data);
    }

    public void printSummary() {
        System.out.println("total number of bag: " + (this.totalREG + this.totalVIP) + " number of Vips: "
                + this.totalVIP + " number of regulars: " + this.totalREG + " total weight: " + this.totalWeight);
    }

    public void printDetails() {
        printSummary();

        Node curNode = headNode;
        while (curNode != null) {

            System.out.println(curNode.getData().toString());

            curNode = curNode.getNext();
        }
    }

    private void removeNode(Node node) {

       
        this.totalWeight = this.totalWeight - node.getData().getWeight();
        
        if (node.getData().getIsVIP()) {
            this.totalVIP--;

        } else {
            this.totalREG--;
        }
        Node next = node.getNext();
        Node prev = node.getPrev();

        if (next == null && prev == null) {
            headNode = null;
            tailNode = null;
            return;
        }

        if (next != null && prev != null) {
            next.setPrev(prev);
            prev.setNext(next);
        } else if (next == null) {
            prev.setNext(next);
            tailNode = prev;
        } else {
            next.setPrev(prev);
            headNode = next;
        }
    }

    public void loadFlight(int number) {

        Node curNode = headNode;
        int numBags = 0;
        while (curNode != null) {

            if (curNode.getData().getFlightNumber() == number) {
                removeNode(curNode);
                numBags++;
            }

            curNode = curNode.getNext();

        }

        System.out.println(numBags+" bags loaded onto flight "+ number);
    }

    public void removeOverSize(double number) {

        Node curNode = headNode;
        int numBags = 0;
        while (curNode != null) {

            if (curNode.getData().getSize() > number) {
                removeNode(curNode);
                numBags++;
            }

            curNode = curNode.getNext();

        }

        System.out.println(numBags+" bags removed as oversize");
    }

    private void update(Baggage data) {
        if (data.getIsVIP()) {
            this.totalVIP++;
        } else {
            this.totalREG++;
        }

        this.totalWeight += data.getWeight();

    }
}
