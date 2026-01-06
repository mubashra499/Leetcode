import java.util.Stack;

class MinStack {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {}

    public void push(int x) {
        main.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        int removed = main.pop();
        if (removed == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */