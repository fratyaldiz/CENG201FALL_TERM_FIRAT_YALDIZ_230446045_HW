public class TreatmentQueue {
    private class Node{
        TreatmentRequest request;
        Node next;

        Node(TreatmentRequest request) {
            this.request = request;
            this.next = null;
        }
    }
    private Node front; //head of tail
    private Node rear;  //last of tail
    private int count;  // number of elements

    public TreatmentQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public void enqueue(TreatmentRequest request) { //adds to queue
        Node newNode = new Node(request);
        if(rear == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
        System.out.println("Enqueued: " + request.patientId);
    }

}
