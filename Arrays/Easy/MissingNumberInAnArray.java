class MissingNumberInAnArray {

    // double for loop
    // TC: O(n^2) SC: O(1)
    public static int missingNumber(int []a, int n) {
        for(int i = 1; i <= n; i++) {
            boolean found = false;
            for(int j = 0; j < n; j++) {
                if(a[j] == i) found = true;
            }
            if(!found) return i;
        }
        return -1;
    }

    // LC: #268   https://leetcode.com/problems/missing-number/
    //different range
    // TC: O(n^2) SC: O(1)
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            boolean found = false;
            for(int j = 0; j < n; j++) {
                if(nums[j] == i) found = true;
            }
            if(!found) return i;
        }
        return -1;
    }

    // using freq map for range
    // TC: O(n) SC: O(n)
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= n; i++) {
            map.put(i, 0);
        }
        for(int i = 0; i < n; i++) {
            map.put(nums[i], 1);
        }
        for(int i = 0; i <= n; i++) {
            if(map.get(i) == 0) return i;
        }
        return -1;
    }

    // summation (n * (n + 1))/2
    // TC: O(n) SC: O(1)
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1))/2;
        int currSum = 0;
        for(int val: nums) {
            currSum += val;
        }
        return sum - currSum;
    }

    // XOR

}