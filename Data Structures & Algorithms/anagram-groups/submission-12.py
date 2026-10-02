class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m_res = defaultdict(list)
        for s in strs:
            count_arr = [0] * 26
            
            for c in s:
                count_arr[ord(c) - ord('a')] += 1

            m_res[tuple(count_arr)].append(s)   

        return list(m_res.values())

              

        