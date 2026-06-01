class Solution {
    public int[] sortArray(int[] nums) {
       if(nums == null || nums.length <= 1) return nums;

       mergeSort(nums, 0, nums.length - 1);
       return nums; 
    }

    private void mergeSort(int[] nums, int left, int right) {
        if(left >= right) return;
        
        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        List<Integer> tempArr = new ArrayList<>();

        int iIdx = left;
        int jIdx = mid + 1;

        while(iIdx <= mid && jIdx <= right) {
            if(nums[iIdx] <= nums[jIdx]) {
                tempArr.add(nums[iIdx]);
                iIdx++; 
            } else {
                tempArr.add(nums[jIdx]);
                jIdx++;
            }
        }

        while(iIdx <= mid) {
            tempArr.add(nums[iIdx]);
            iIdx++;
        }

        while(jIdx <= right) {
            tempArr.add(nums[jIdx]);
            jIdx++;
        }

        for(int i = left; i <= right; i++) {
            nums[i] = tempArr.get(i - left);
        }
        
    }
}