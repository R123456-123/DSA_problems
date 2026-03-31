class Solution {
    public int longestConsecutive(int[] nums) {
     int res = 0;
     Set<Integer> stores = new HashSet<>();
     for(int num : nums){
        stores.add(num);
     }

     for(int num : nums) {
        int streak = 0, curr = num;
        while(stores.contains(curr)) {
            streak++;
            curr++;
        }
        res = Math.max(res, streak);
     }
     return res;
    }
}
