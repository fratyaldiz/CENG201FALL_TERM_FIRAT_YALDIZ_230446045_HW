public class TreatmentTest {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();


        //Add 8 treatment requests.
        queue.enqueue(new TreatmentRequest(1,true));
        queue.enqueue(new TreatmentRequest(2,false));
        queue.enqueue(new TreatmentRequest(3,true));
        queue.enqueue(new TreatmentRequest(4,false));
        queue.enqueue(new TreatmentRequest(5,true));
        queue.enqueue(new TreatmentRequest(6,false));
        queue.enqueue(new TreatmentRequest(7,false));
        queue.enqueue(new TreatmentRequest(8,true));

        //Process (dequeue) 3 requests.
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //Print the remaining queue
        queue.printQueue();

    }
}
