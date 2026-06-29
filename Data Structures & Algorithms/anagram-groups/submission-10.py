class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map_list = defaultdict(list)

        for s in strs:
            key = ''.join(sorted(s))
            map_list[key].append(s)
        return list(map_list.values())  
 

        