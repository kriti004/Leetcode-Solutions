class Solution {
    public int findDuplicate(int[] nums) {
//         int k=1;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//                     k=nums[i];
//             }
//         }
//         return k;
        
//          int k=0;
//         Arrays.sort(nums);
//         for(int i=1;i<nums.length;i++){
       
//         if(nums[i-1]==nums[i])
//             k=nums[i];
//         }
//         return k;
        
        if(nums.length > 1){
int slow= nums[0];
int fast = nums[nums[0]];
while(slow != fast){
slow = nums[slow];
fast = nums[nums[fast]];
}
fast = 0;
while(fast != slow){
fast = nums[fast];
slow = nums[slow];
}
return slow;
}
return -1;
    }
}