
public class LinkedMain {

    public static void main(String[] args) {
        LinkedListQueues queue = new LinkedListQueues();

        // Enqueueing some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue an element
        System.out.println("Dequeued: " + queue.dequeue());

        // Check the size of the queue
        System.out.println("Current size: " + queue.getSize());

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue all elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
