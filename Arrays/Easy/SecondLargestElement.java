class SecondLargestElement {


    //1. Sort and return last
    //TC: O(nlogn)  SC: O(1)
    int print2largest2(int arr[], int n) {
        if(arr.length == 1) return -1;
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    //Second largest and smaller element
    //Single pass
    //TC: O(n)  SC: O(1)
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int element: a) {
            if(element > max) {
                sMax = max;
                max = element;
            } else if(element > sMax && element < max) {
                sMax = element;
            }
            if(element < min) {
                sMin = min;
                min = element;
            } else if(element < sMin && element > min) {
                sMin = element;
            }
        }
        return new int[]{sMax, sMin};
    }

}