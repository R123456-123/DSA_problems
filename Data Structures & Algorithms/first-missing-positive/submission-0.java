class Solution {
    public int firstMissingPositive(int[] nums) {
        int missNum = 1;

        while(true) {
            boolean flag = true;

            for(int num : nums) {
                if(missNum == num) {
                    flag = false;
                    break;
                } 
            }

            if(flag) return missNum;

            missNum++;
        }
    }
}