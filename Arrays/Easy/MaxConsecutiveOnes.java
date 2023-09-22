class MaxConsecutiveOnes {

    // LC #485 https://leetcode.com/problems/max-consecutive-ones/

    // TC: O(n)   SC: O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int val: nums) {
            if(val == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}