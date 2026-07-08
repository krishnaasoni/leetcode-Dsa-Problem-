class Solution {
    public int largestAltitude(int[] gain) {
        int max= 0;
        int num = 0;

        for (int i=0; i<gain.length; i++){
            num = num +gain[i];
            while(max<num){
              max = num; 
            }
        }
        return max;


         
    }
}