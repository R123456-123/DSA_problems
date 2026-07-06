class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        res = 0
        map_str = {}
        max_freq = 0

        l = 0
        for r in range(len(s)):
            map_str[s[r]] = map_str.get(s[r],0) + 1

            max_freq = max(max_freq, map_str.get(s[r]))

            while (r - l + 1) - max_freq > k:
                map_str[s[l]] = map_str.get(s[l]) - 1
                l += 1

            res =  max(res, r - l + 1)

        return res       


        