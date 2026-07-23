class Solution {
    public int maxArea(int[] height) {
        int st =0; 
        int n= height.length;
        int end =n-1;
        int maxArea=0;

        while (st<end){
            int area = (end-st)*Math.min(height[st], height[end]);
            maxArea=Math.max(maxArea, area);
            if(height[st]<height[end]){
                st++;
            }
            else{
                end--;
            }
        }
        return maxArea;


        //or 
        //note --> is code me time limitExceed aa jata hai is lye hum topointer try karte hai  

      
        // int maxArea= 0;

        // for(int i=0; i<height.length; i++){
        //     for(int j=i+1; j<height.length; j++){
        //         int area= (j-i) * Math.min(height[i], height[j]);
        //         maxArea= Math.max(maxArea, area);
                
        //     }
        // }
        // return maxArea;

    }
}