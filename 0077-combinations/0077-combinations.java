class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1 ,n, k, temp, ans);
        return ans;
    }
    public void solve(int st, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(k == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = st; i<=n; i++){
            temp.add(i);
            solve(i+1, n, k-1, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}