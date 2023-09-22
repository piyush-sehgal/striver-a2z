class SingleElement {

    // LC #136 https://leetcode.com/problems/single-number/


    // Using freq map
    // TC: O(n) SC: O(n)
    public static int getSingleElement(int []arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int val: arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }


    // Using XOR
    // TC: O(n)  SC: O(1)
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int val: nums) {
            xor = xor ^ val;
        }
        return xor;
    }
}