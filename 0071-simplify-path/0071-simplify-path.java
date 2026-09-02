
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s : arr){
            if(!st.isEmpty() && s.equals("..")){
                st.pop();
            }else if(!s.equals(".") && !s.equals("..") && !s.equals("")){
                st.push(s);
            }
        }
        String ans = "";
        for(String i : st){
            ans += "/"+ i;
        }
        return st.isEmpty() ? "/" : ans;
    }
}