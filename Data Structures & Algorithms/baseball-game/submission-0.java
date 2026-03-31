class Solution {
    public int calPoints(String[] operations) {
        int res = 0;

        Stack<Integer> stack = new Stack<>();

        for(String s : operations) {
            if(s.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
               
                stack.push(top);
                stack.push(newTop);
                
            } else if(s.equals("D")) {
                int top = stack.pop();
                
                stack.push(top);
                stack.push(top * 2);

            } else if(s.equals("C")) {
                stack.pop();

            } else {
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }

        for(int n : stack) {
            res += n;
        }

        return res;
    }
}