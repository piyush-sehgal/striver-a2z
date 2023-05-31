class SecondLargestElement {


    //1. Sort and return last
    //TC: O(nlogn)  SC: O(1)
    int print2largest2(int arr[], int n) {
        if(arr.length == 1) return -1;
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    //2 pointers
    //TC: O(n)  SC: O(1)
    int print2largest(int arr[], int n) {
        if(n == 1) return -1;
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int val: arr) {
            if(max < val) {
                sMax = max;
                max = val;
            }
            else if(max > val && sMax < val) {
                sMax = val;
            }
        }
        if(sMax == Integer.MIN_VALUE) {
            return -1;
        }
        return sMax;
    }

}