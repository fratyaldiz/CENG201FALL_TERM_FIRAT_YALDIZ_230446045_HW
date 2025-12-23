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
        if(rear == null) {      //For queue is empty
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
        System.out.println("Enqueued:" + request.patientId);
    }

    public TreatmentRequest dequeue() { //deletes element from the queue
        if(front == null) {         //For queue is empty
            System.out.println("Queue's empty");
            return null;
        }
        TreatmentRequest request = front.request;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
        System.out.println("Dequeued:" + request.patientId);
        return request;
    }

    public int size() { // number of elements
        return count;
    }

    public void printQueue() {  //prints of queue
        if (front == null) {
            System.out.println("Queue's empty");
        }
        Node current = front;
        while (current != null) {
            System.out.println(current.request);
            current = current.next;
        }
    }

}
