class RemoveDuplicatesFromSortedArray {

    //Using set
    // TC: O(n)  SC: O(n)
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while(j != arr.size()) {
            if(!set.contains(arr.get(j))) {
                set.add(arr.get(j));
                swap(arr, i, j);
                i++;
            }
            j++;
        }
        return i;
    }


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

    //TC: O(n)  SC: O(1)
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        int i = 0;
        int j = 0;
        while(j != n) {
            if(arr.get(i) != arr.get(j)) {
                swap(arr, i + 1, j);
                i++;
            }
            j++;
        }
        return i + 1;
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}