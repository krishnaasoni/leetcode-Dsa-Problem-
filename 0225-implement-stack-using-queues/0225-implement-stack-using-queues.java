class MyStack {
    Queue<Integer> q;
    Queue<Integer> helper;

    public MyStack() {
        q = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        while (!q.isEmpty()) {
            helper.add(q.poll());
        }
        q.add(x);
        while (!helper.isEmpty()) {
            q.add(helper.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */