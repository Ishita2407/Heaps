Solution 1:
 Brute force approach - Sorting
  class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Brute force appraoch
        // Apply sorting and then return the n - kth element from the end
        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - k];
    }
}


Solution 2
// MinHeap
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Use minHeap -> since k and largest is mentioned
        int n = nums.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            minHeap.add(nums[i]);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
