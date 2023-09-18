class CheckIfArrayIsSorted {


    //TC: O(n)  SC: O(1)
    boolean arraySortedOrNot(int[] arr, int n) {
        int p1 = 0;
        int p2 = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] < p2) return false;
            else {
                p1 = p2;
                p2 = arr[i];
            }
        }
        return true;
    }

    // 1 is sorted, 0 is not sorted
    public static int isSorted(int n, int []a) {
        for(int i = 0; i < n - 1; i ++) {
            if(a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}