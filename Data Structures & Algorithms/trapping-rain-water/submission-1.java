class Solution {
    public int trap(int[] height) {
     int n = height.length, leftMax = 0, rightMax = 0;
     int res = 0, l = 0, r = n - 1;

     while(l <= r) {
        if(height[l] <= height[r]) {
            if(leftMax <= height[l]) {
                leftMax = height[l];
            } else {
                res += leftMax - height[l];
            }
            l++;
        } else {
            if(rightMax <= height[r]) {
                rightMax = height[r];
            } else {
                res += rightMax - height[r];
            }
            r--;
        }
     }

     return res;
    }
}
