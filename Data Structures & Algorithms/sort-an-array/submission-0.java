class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        quickSort(nums, 0, n - 1); 

        return nums;
    }

    private void quickSort(int[] arr, int low, int high) {

       if(low < high) {
         int pivotIndex = partition(arr, low, high);

         quickSort(arr, low, pivotIndex - 1);

         quickSort(arr, pivotIndex + 1, high);
       }

    }

    private int partition(int[] arr, int low, int high) {
       int pivot = high;

       int idx = low - 1;

       for(int j = low; j < high; j++) {
        if(arr[j] <= arr[high]) {
            idx++;

            int temp = arr[j];
            arr[j] = arr[idx];
            arr[idx] = temp;

        }
       }
       
       idx++;

       int temp = arr[high];
       arr[high] = arr[idx];
       arr[idx] = temp;

       return idx;
    }
}