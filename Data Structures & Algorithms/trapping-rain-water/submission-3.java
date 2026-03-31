class Solution {
    public int trap(int[] height) {
        int n = height.length, water = 0;
        int l = 0, r = n - 1, leftMax = height[l], rightMax = height[r];

        while(l < r) {
            if(height[l] <= height[r]) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                water += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                water += rightMax - height[r];
            }
        }
        return water;
    }
}
