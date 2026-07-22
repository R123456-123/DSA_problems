class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        if(n <= 1) return true;

        int farest = nums[0];

        int i = 0;
        while(i <= farest) {
            farest = Math.max(farest,i + nums[i]);

            if(farest >= n - 1) {
               return true;
            }

            i++;
        }

        return false;
    }
}
