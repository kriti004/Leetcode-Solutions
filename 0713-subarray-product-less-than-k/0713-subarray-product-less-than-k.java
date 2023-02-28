class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                m++;
            }
            int mul=nums[i];;
            for(int j=i+1;j<nums.length;j++){
                mul=mul*nums[j];
                if(mul<k){
                    m++;
                }
                else{
                    break;
                }
            }
        }
        return m;
    }
}