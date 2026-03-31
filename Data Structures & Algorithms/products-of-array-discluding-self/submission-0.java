class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] res = new int[nums.length];
       int i = 0;
       while(i < nums.length) {
        int prod = 1;
         for(int j = 0; j < nums.length; j++) {
            if(i != j) {
                prod *= nums[j];
            }
         }
         res[i] = prod;
         i++;
       } 
       return res;
    }
}  
