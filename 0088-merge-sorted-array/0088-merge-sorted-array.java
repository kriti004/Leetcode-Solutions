class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         ArrayList <Integer> arr= new ArrayList<>();
//         ArrayList <Integer> ar= new ArrayList<>();
//         for(int i:nums1){
//             if(i!=0)
//             arr.add(i);
//         }
        
//         for(int i:nums2){
//             arr.add(i);
//         }
        
      
        
//         for(Integer i:arr)
//         nums1[idx]= i;
//         idx++;
        
//         int idx=-1;
//         for(int i=0;i<nums1.length;i++)
//         {
//             if(nums1[i]==0)
//             {
//                 idx++;
//                 nums1[i]=nums2[idx];
               
//             }
//         }
//         Arrays.sort(nums1);
        
         int j = 0;  
        // traversal start from length of nums1  
        for(int i = m;i < m + n; i ++){
            nums1[i] = nums2[j ++];
        }
        // after sorting this
        Arrays.sort(nums1);
        
        
    }
}