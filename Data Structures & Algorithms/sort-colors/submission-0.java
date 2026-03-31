class Solution {
    public void sortColors(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();

        int[] count = new int[max + 1];

        for(int num : nums) {
            count[num]++; 
        }

        int idx = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i]-- > 0) {
                nums[idx++] = i;
            }
        }
    }
}