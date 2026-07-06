class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) < 1:
            return 0

        if len(s) == 1:
            return 1

        res = 0
        set_str = set()

        l = 0
        for i in range(len(s)):
            while s[i] in set_str:
                set_str.remove(s[l])
                l += 1

            set_str.add(s[i])

            res = max(res, i - l + 1)

        return res       

                    
        
        