class Solution {
public List<List<Integer>> permute(int[] nums) {
List<List<Integer>> ans = new ArrayList<>();
ArrayList<Integer> temp = new ArrayList<>();
solve(nums, ans, temp);
return ans;
}
void solve(int[] nums, List<List<Integer>> ans , ArrayList<Integer> temp){
if(temp.size() == nums.length){
ans.add(new ArrayList<>(temp));
return;
}
for(int i = 0; i<nums.length; i++){
if(temp.contains(nums[i])) continue;
temp.add(nums[i]);
solve(nums, ans, temp);
temp.remove(temp.size()-1);
}
}
}