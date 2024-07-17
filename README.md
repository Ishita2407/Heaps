# Heaps


In Java, you can use the PriorityQueue class to create both min-heaps and max-heaps. By default, PriorityQueue is a min-heap. To create a max-heap, you need to use a custom comparator. 

Min-Heap
Creating a min-heap is straightforward since PriorityQueue is implemented as a min-heap by default.

    import java.util.PriorityQueue;

    public class MinHeapExample {
   
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(15);
        
        System.out.println("Min-Heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}

Max-Heap
To create a max-heap, you need to provide a custom comparator that reverses the natural ordering.

    import java.util.PriorityQueue;
    import java.util.Collections;


    public class MaxHeapExample {
     
     public static void main(String[] args) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);

        System.out.println("Max-Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
Explanation
Min-Heap:

PriorityQueue<Integer> minHeap = new PriorityQueue<>(); creates a priority queue that orders elements in their natural order (ascending).
minHeap.add(value); adds elements to the min-heap.
minHeap.poll(); retrieves and removes the head of the queue (smallest element).


Max-Heap:

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); creates a priority queue with a custom comparator that orders elements in reverse order (descending).
maxHeap.add(value); adds elements to the max-heap.
maxHeap.poll(); retrieves and removes the head of the queue (largest element).


- > Common Methods
These methods are applicable to both min-heaps and max-heaps since they are provided by the PriorityQueue class.

- add(E e)
Inserts the specified element into the priority queue.

PriorityQueue<Integer> heap = new PriorityQueue<>();
heap.add(10);

- offer(E e)
Inserts the specified element into the priority queue.

PriorityQueue<Integer> heap = new PriorityQueue<>();
heap.offer(20);

- poll()
Retrieves and removes the head of the queue (the smallest element for min-heap or the largest for max-heap).

Integer head = heap.poll();

- remove()
Retrieves and removes the head of the queue. This method is similar to poll().

Integer head = heap.remove();

- peek()
Retrieves, but does not remove, the head of the queue.

Integer head = heap.peek();
- element()
Retrieves, but does not remove, the head of the queue. This method throws an exception if the queue is empty.

Integer head = heap.element();
- size()

Returns the number of elements in the queue.
int size = heap.size();
- isEmpty()
Returns true if the queue contains no elements.
boolean empty = heap.isEmpty();
- clear()
Removes all of the elements from the queue.

heap.clear();
- contains(Object o)
Returns true if the queue contains the specified element.
boolean contains = heap.contains(15);

NOTE
Both poll() and remove() methods in Java's PriorityQueue class are used to remove the head of the queue. However, there are subtle differences between the two:

poll(): This method retrieves and removes the head of the queue, or returns null if the queue is empty. It is safe to use when you are not sure whether the queue is empty or not because it will not throw an exception if the queue is empty.
remove(): This method also retrieves and removes the head of the queue, but it throws a NoSuchElementException if the queue is empty.
