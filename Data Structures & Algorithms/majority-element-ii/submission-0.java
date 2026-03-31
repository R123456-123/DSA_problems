class Solution {
    public List<Integer> majorityElement(int[] nums) {
      if(nums == null || nums.length == 0);

      List<Integer> res = new ArrayList<>();
      Map<Integer,Integer> countMap = new HashMap<>();
      int n = nums.length;
      int k = n/3; 

      for(int num : nums) {
        countMap.put(num, countMap.getOrDefault(num,0) + 1);

        if(countMap.get(num) > k && !res.contains(num)) {
            res.add(num);
        }
      } 

      return res;
    }
}