class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr =new int[nums.length];
       
            for(int j=0;j<nums.length;j++){
                int mul=nums[j]*nums[j];
                arr[j]= mul;
                
            }
        
        Arrays.sort(arr);
        return arr;
    }
}