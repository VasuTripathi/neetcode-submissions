class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int con = 0 ; 
        int n = nums.length;
        int longest = 1 ;  
        int currentStreak = 1;

        if (nums.length == 0) return 0;
        for(int i = 1 ; i < n  ; i++ ){

          if(nums[i]==nums[i-1]){
            continue;
          }
          
          if(nums[i] == nums[i-1]+1){
            currentStreak++;
          }
          else{
            currentStreak = 1 ;
          }
          longest = Math.max(longest,currentStreak);
        }
        return longest;
    }
}
