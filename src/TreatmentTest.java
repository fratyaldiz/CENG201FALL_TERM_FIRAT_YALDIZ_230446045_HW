public class TreatmentTest {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();


        //Add 8 treatment requests.
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i));
        }

        //Process (dequeue) 3 requests.
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //Print the remaining queue
        queue.printQueue();
    }
}
