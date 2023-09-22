class MergeTwoSortedArrays {
    //Also known as Union two arrays

    // TC: O(m + n)  SC: O(m + n) considering all elements are unique
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while(i != n && j != m) {
            if(a[i] <= b[j]) {
                // 2 conditions are checked here
                // if list is empty OR if list is not empty and last element in list is
                // smaller than current element
                if(list.isEmpty() || (!list.isEmpty() && list.get(list.size() - 1) < a[i])) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if(list.isEmpty() || (!list.isEmpty() && list.get(list.size() - 1) < b[j])) {
                    list.add(b[j]);
                }
                j++;
            }
        }
        // to capture remaining element in arr a
        while(i != n) {
            if(!list.isEmpty() && list.get(list.size() - 1) < a[i]) {
                list.add(a[i]);
            }
            i++;
        }
        // to capture remaining element in arr b
        while(j != m) {
            if((!list.isEmpty() && list.get(list.size() - 1) < b[j])) {
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}