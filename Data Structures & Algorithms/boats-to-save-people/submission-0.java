class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        
        int l = 0, r = people.length - 1;

        while(l <= r) {
            int remain = limit - people[r--];
            boat++;

            if(l <= r && remain >= people[l]) {
                l++;
            }  

        }

        return boat;
    }
}