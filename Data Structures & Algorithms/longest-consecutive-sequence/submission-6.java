class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
    Arrays.sort(nums);
    int Maxcount=1;
    int count=1;
    for(int i=1;i<nums.length;i++){
        // skip duplicates
         if(nums[i]==nums[i-1]){
            continue;
         }
         if(nums[i]==nums[i-1]+1){
            count++;
         }
         else {
            Maxcount=Math.max(Maxcount,count);
            count=1;
            // reset the count as if in case of 2,3,4,5,10,11 so in 10,11 
            // it again count if we donot reset
         }
    }
return Math.max(Maxcount,count);
    }
}
