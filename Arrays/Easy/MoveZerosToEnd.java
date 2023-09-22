class MoveZerosToEnd {
    
    // #283 https://leetcode.com/problems/move-zeroes/

    // 2 pointers

    // TC: O(n) SC: O(1)
    public static int[] moveZeros(int n, int []a) {
        int rP = 0; //runing pointer: to iterate
        int sP = 0; //swap pointer: to swap
        while(rP != n) {
            if(a[rP] == 0) {
                if(a[sP] == 0) {
                    rP++;
                }
            } else {
                if(a[sP] == 0) {
                    int temp = a[sP];
                    a[sP] = a[rP];
                    a[rP] = temp;
                }
                rP++;
                sP++;
            }
        }
        return a;
    }
}