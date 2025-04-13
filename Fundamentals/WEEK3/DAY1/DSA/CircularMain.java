
public class CircularMain {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

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

        // Check if the queue is full
        System.out.println("Is the queue full? " + queue.isFull());

    }
}
