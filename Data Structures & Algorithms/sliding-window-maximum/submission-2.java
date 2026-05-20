class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int [] result = new int[n-k+1];
    //setup deque for k ele & remove all smaller ele
    for(int i = 0 ; i < k;i++){
        while(!deque.isEmpty()&& nums[deque.peekLast()] <= nums[i]){
            deque.pollLast();
        }
        deque.offerLast(i);
    }
    // 1st is max
    result[0] = nums[deque.peekFirst()];
    // remaining ele 
    for(int i=k; i<n; i++){
    //remove ele 1st ele (if this is the index we r removing)
    if(deque.peekFirst() <= i - k){
        deque.pollFirst();
    }
    //remove all te elements which are smaller than incoming elements 
    while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
        deque.pollLast();
    }
        deque.offerLast(i);

    result [i-k+1] = nums[deque.peekFirst()];
    }
    return result;
    }
}
