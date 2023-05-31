class RemoveDuplicatesFromSortedArray {



    //TC: O(n)  SC: O(1)
    int remove_duplicate(int arr[],int N){
        int j = 0;
        for(int i = 1; i < N; i++) {
            if(arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j + 1];
                arr[j + 1] = temp;
                j++;
            }
        }
        return j + 1;
    }
}