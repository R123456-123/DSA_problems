class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int right = people.length - 1;
        int left = 0, res = 0;

        while(left <= right) {
            int leftOut = limit - people[right];
            right--;
            res++;

            if(left <= right && leftOut >= people[left]) {
                left++;
            }
        } 

        return res;
    }
}