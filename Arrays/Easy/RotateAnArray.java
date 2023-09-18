class RotateAnArray{

    //Use temp array to store k elements and shift others by k places
    //TC: O(n), SC: O(k)

    //Optimised: Using reverse

    //TC: O(n)  SC: O(1)
    public void rotateRight(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k = k % nums.length;
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, 0, n - 1);
    }

    //TC: O(n)  SC: O(1)
    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k = k % nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}