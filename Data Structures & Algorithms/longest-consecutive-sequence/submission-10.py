class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        log_seq = defaultdict(int)
        res = 0

        for num in nums:
            if not log_seq[num]:
                log_seq[num] = 1 + log_seq[num - 1] + log_seq[num + 1]
                log_seq[num - log_seq[num - 1]] = log_seq[num]
                log_seq[num + log_seq[num + 1]] = log_seq[num]
                res = max(res,log_seq[num])

        return res        

        