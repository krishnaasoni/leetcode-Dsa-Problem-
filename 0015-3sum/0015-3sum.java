// Leetcode 15. 3Sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            int st = i+1;
            int end = n-1;
            while(st< end){
                int sum = nums[i] + nums[st] + nums[end];
                if(sum == 0){

                    // ya to ye bhi use kar sakte hai 

                    
                    // List<Integer> list = new ArrayList<>();
                    // list.add(nums[i]);
                    // list.add(nums[st]);
                    // list.add(nums[end]);


                    //[Arrays.asList()] ek method hai jo array ko fixed-size List view me convert karta hai.ye Array- list me use hota hai  ye same hai iss tarh jaise array me ye concept hota hai [new int []{}]

                    //new int[]{} ek syntax hai jo ek naya integer array banata hai aur usko values ke saath initialize karne ke liye use hota hai.

                    result.add(Arrays.asList(nums[i], nums[st], nums[end]));
                    st++;
                    end--;
                }else if(sum > 0){
                    end--;
                }else {
                    st++;
                }
            }
        }
        return new ArrayList<>(result);

    }
}