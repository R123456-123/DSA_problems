class MinStack {
    Stack<Integer> stack;

    public MinStack() {
       stack = new Stack<>(); 
    }
    
    public void push(int val) {
       stack.push(val);  
    }
    
    public void pop() {
       if(stack.isEmpty()) return ;
       stack.pop();
    }
    
    public int top() {
       if(stack.isEmpty()) return -1;

       return stack.peek(); 
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();

        int mini = stack.peek();

        while(!stack.isEmpty()) {
            mini = Math.min(mini, stack.peek());
            tmp.push(stack.pop());
        }

        while(!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return mini;
    }
}
