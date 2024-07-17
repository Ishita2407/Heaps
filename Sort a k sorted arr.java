class Solution {
    public int[] sortArray(int[] nums) {
        // Min heap TC: O(nlogn) SC: O(n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0;
        int n = nums.length;
        int ans[] = new int[n];

        for(int num : nums){
            minHeap.offer(num);
        }

        while(!minHeap.isEmpty()){
            ans[i++] = minHeap.poll();
        }
        return ans;
    }
}
