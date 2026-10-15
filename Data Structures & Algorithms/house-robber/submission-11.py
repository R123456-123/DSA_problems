class Solution:
    def rob(self, nums: List[int]) -> int:

        if not nums:
            return 0
        if len(nums) < 2:
            return nums[0]

        one = nums[0]
        teo = max(nums[0], nums[1])

        for i in range(2,len(nums)):
            tem = max(one + nums[i], teo)
            one = teo
            teo = tem


        return teo

        