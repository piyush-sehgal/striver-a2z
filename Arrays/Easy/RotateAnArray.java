class RotateAnArray{

    //Use temp array to store k elements and shift others by k places
    //TC: O(n), SC: O(k)

    //Rotate left
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int temp[] = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = arr.get(i);
        }
        int j = 0;
        for(int i = k; i < n; i++) {
            arr.set(j++, arr.get(i));
        }
        j = 0;
        for(int i = n - k; i < n; i++) {
            arr.set(i, temp[j++]);
        }
        return arr;
    }

    //rotate right
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k = k % n;
        int temp[] = new int[k];
        int j = 0;
        // copy to temp
        for(int i = n - k; i < n; i++) {
            temp[j++] = nums[i];
        }
        // move remaining to right
        j = n - 1;
        for(int i = n - k - 1; i > -1; i--) {
            nums[j--] = nums[i];
        }
        // copy from temp to main
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

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