class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        arr = [0] * (2 * len(nums))
        i = 0
        for i in range(len(nums)):
            arr[i] = arr[i + len(nums)] = nums[i]


        return arr