class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        pref = 1
        for i in range(len(nums)):
            res[i] = pref
            pref = pref * nums[i] #[1, 1, 2, 8]

        suffix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] = res[i] * suffix
            suffix = suffix * nums[i]

        return res        





        