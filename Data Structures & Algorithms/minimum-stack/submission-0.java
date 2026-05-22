
class MinStack {
    Stack<Integer> stack = new Stack<>();
    public MinStack() {
    }
    public void push(int val) {
        stack.push(val);
    }
    public void pop() {
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        int min = Integer.MAX_VALUE;
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (val < min) {
                min = val;
            }
            temp.push(val);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return min;
    }
}