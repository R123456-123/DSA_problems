class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int[] res = new int[arr.length];
        int rightMax = arr[arr.length - 1];
        res[res.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--) {
            res[i] = rightMax;

            if(arr[i] >= rightMax) {
                rightMax = arr[i];
            }
        }

        return res;
    }
}