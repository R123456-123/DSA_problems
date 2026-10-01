class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        if not strs:
            return ""

        prefix = strs[0]

        for i in range(1, len(strs)):
            se = strs[i]

            match_len = 0

            for j in range(min(len(prefix), len(se))):
                if prefix[j] == se[j]:
                    match_len += 1
                else:
                    break  

            prefix = prefix[:match_len] 

        return prefix             




        