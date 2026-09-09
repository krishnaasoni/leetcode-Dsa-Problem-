class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        int sign = 1;
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '+') {
                result = result + (num * sign);
                num = 0;
                sign = 1;
            } else if (ch == '-') {
                result = result + (num * sign);
                num = 0;
                sign = -1;
            } else if (ch == '(') {
                st.push(result);
                st.push(sign);
                num = 0;
                sign = 1;
                result = 0;
            } else if (ch == ')') {
                result = result + (num * sign);
                result = result * st.pop();
                result = result + st.pop();
                num = 0;
                sign = 1;
            } else if (ch != ' ') {
                num = num * 10 + ch - '0';
            }
        }
        result = result + (num * sign);
        return result;
    }
}