class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) == 0 or len(t) == 0:
            return ""
     
        map_t = {}
        map_win = {}

        for c in t:
            map_t[c] = 1 + map_t.get(c,0)


        l = 0 
        need = len(map_t)
        have = 0
        res = [-1,-1]
        res_len = float("infinity")

        for r in range(len(s)):
            c = s[r]

            map_win[c] = 1 + map_win.get(c,0)

            if c in map_t and map_win[c] == map_t[c]:
                have += 1

            while have == need:
                if (r - l + 1) < res_len:
                    res = [l,r]
                    res_len = r - l + 1
                
                map_win[s[l]] -= 1
                if s[l] in map_t and map_win[s[l]] < map_t[s[l]]:
                    have -= 1
                l += 1    

        l, r = res
        return s[l : r + 1] if res_len != float("infinity") else ""             





        