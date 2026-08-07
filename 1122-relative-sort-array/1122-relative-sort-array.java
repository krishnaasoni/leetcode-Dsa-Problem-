class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr= new int[arr1.length];
        Arrays.sort(arr1);
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int  ele:arr1){
            map.put(ele, map.getOrDefault(ele, 0)+1 );
        }
        int i=0; 

        for ( int ele: arr2){
            int val= map.get(ele);
            while(val-- > 0){
                arr[i++]= ele;
            }
            map.remove(ele);
        }

        for (int ele: arr1){
            if(map.containsKey(ele)){
                int val= map.get(ele);
                while(val-- > 0){
                    arr[i++]= ele;
                }
                map.remove(ele);
            }
        }

        return arr;

    }
}