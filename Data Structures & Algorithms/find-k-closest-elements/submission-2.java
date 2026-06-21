class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            res.add(arr[i]);
        }

        if(k == arr.length) {
            return res;
        }

        for(int i = k; i < arr.length; i++) {

           if(Math.abs(arr[i] - x) < Math.abs(res.get(0) - x)) {
            res.remove(0);
            res.add(arr[i]);
           } 
           
         }

         return res;

    }
}