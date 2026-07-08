class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(t) == 0:
            return ""

        map_t, map_win = {}, {}

        for c in t:
            map_t[c] = map_t.get(c,0) + 1

        l, res, res_len = 0, [-1,-1], float("infinity")  
        need, have = len(map_t), 0

        for r in range(len(s)):
            c = s[r]

            map_win[c] = map_win.get(c,0) + 1

            if c in map_t and map_t[c] == map_win[c]:
                have += 1

            while have == need:
                if (r - l + 1) < res_len:
                    res = [l,r]
                    res_len = r - l + 1

                map_win[s[l]] = map_win.get(s[l],0) - 1

                if s[l] in map_t and map_win[s[l]] < map_t[s[l]]:
                    have -= 1
                    
                l += 1    

        l, r = res
        return s[l : r + 1] if res_len != float("infinity") else ""                  




        