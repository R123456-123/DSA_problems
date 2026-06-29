class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        have_contained = {}

        for i, num in enumerate(nums):
            diff = target - num
            if diff in have_contained:
                return [have_contained[diff], i]
            have_contained[num] = i     