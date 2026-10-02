class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m_res = defaultdict(list)
        for s in strs:
            sorted_s = ''.join(sorted(s))
            m_res[sorted_s].append(s)

        return list(m_res.values())

              

        