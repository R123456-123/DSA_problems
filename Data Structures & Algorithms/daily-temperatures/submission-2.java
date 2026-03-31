class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
       int[] res = new int[temperatures.length];
       for(int i = 0; i < temperatures.length - 1; i++) {
        int tem = temperatures[i];
        int j = i + 1;
        while(j < temperatures.length) {
            if(temperatures[j] > tem) {
               res[i] = j - i;
               break;
            } 
            j++;
        }
       } 
       return res;
    }
}
