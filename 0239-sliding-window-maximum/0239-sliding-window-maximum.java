class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        Deque<Integer> dq = new LinkedList<>();
int[] arr = new int[n-k+1];
if(n == 0) return new int[0];

// first k ele check kro
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&& nums[i]>=nums[dq.peekLast()])
            dq.removeLast();
            dq.addLast(i);
        }

    for(int i=k;i<n;i++){
        // the ele at front of deq is max for prev subarr
        arr[i-k] = nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
               dq.removeFirst();
     // Remove smaller ele 
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            dq.removeLast();

            dq.addLast(i);
        }
        arr[n-k] = nums[dq.peekFirst()];
        return arr;
    }
}