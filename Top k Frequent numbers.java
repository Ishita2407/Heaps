To find the top k most frequent numbers in an array using a min-heap in Java, you can follow these steps:
Use a HashMap to count the frequency of each number in the array.
Use a min-heap (priority queue) to keep track of the top k most frequent numbers.
If the size of the heap exceeds k, remove the element with the smallest frequency.
After processing all elements, the heap will contain the top k most frequent numbers.

public static int[] findTopKFrequentNumbers(int[] arr, int k) {
        // Step 1: Count frequency of each number using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap to keep track of the top k most frequent numbers
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Add entries to the min-heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 3: Extract the top k most frequent numbers from the min-heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }

Explanation:
Counting Frequencies:

Use a HashMap to count the frequency of each number in the array.
The key is the number, and the value is the frequency.
Using a Min-Heap:

Use a PriorityQueue (min-heap) to store the top k entries based on their frequency.
The comparator (a, b) -> a.getValue() - b.getValue() ensures that the heap orders entries by their frequency in ascending order.
Maintaining the Top k Frequencies:

Iterate over the entries of the frequency map.
Add each entry to the min-heap.
If the size of the heap exceeds k, remove the entry with the smallest frequency.
Extracting the Results:

After processing all entries, the heap will contain the top k most frequent numbers.
Convert the heap to an array to get the result.
