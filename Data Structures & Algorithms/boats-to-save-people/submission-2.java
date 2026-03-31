class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int max = Arrays.stream(people).max().getAsInt();

        int[] count = new int[max + 1]; // {0,0,0,0,0,...}

        for(int p : people) {
            count[p]++;
        }

        int idx = 0;
        for(int i = 0; i < count.length; i++) {
           while(count[i] > 0) {
            people[idx++] = i;
            count[i]--;
           }
        }

        int res = 0, left = 0, right = people.length - 1;
        while(left <= right) {
            int remain = limit - people[right--];
            res++;

            if(left <= right && remain >= people[left]) {
              left++;
            }


        }

        return res;
    }
}