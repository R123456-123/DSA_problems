class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}

        for i, n in enumerate(nums):
            d = target - n

            if d in m:
                return [m.get(d), i]

            m[n] = m.get(n, i)

        return []    

