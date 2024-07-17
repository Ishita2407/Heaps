To find the k-th closest number to a given value x in an array using a max-heap in Java, you can follow these steps:
Create a max-heap (priority queue with reverse order) that will keep the closest k numbers.
Iterate through the array and add each number to the max-heap based on the absolute difference between the number and x.
If the heap size exceeds k, remove the largest element from the heap.
After processing all elements, the heap will contain the k closest numbers.

public static int[] findKClosestNumbers(int[] arr, int k, int x) {
        // Max heap to store the k closest numbers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(Math.abs(b - x), Math.abs(a - x));
            }
        });

        // Add elements to the heap
        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Convert the heap to an array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
