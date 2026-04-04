class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);

            if(minHeap.size() > k){
                //ex. size = 5 k =2
                //remove until size = 2
                //i.e. size > k keep removing
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
