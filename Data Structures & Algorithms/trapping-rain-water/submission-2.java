class Solution {
    public int trap(int[] height) {
        int n = height.length, water = 0;
        int l = 0, r = n - 1, leftMax = 0, rightMax = 0;

        while(l <= r) {
            if(height[l] <= height[r]) {
                if(leftMax <= height[l]) {
                    leftMax = height[l];
                } else {
                    water += leftMax - height[l];
                }
                l++;
            } else {
                if(rightMax <= height[r]) {
                    rightMax = height[r];
                } else {
                    water += rightMax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
