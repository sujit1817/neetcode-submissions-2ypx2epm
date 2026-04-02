class Solution {
    public int longestConsecutive(int[] nums) {

      //if array empty return zero as count
         if(nums.length==0){
          return 0;
        }
        //sort
        Arrays.sort(nums);

        //two variables

        int count = 1;//length of the current consecutive sequence
        int maxCount = 1;//longest seq conse

//iterate
        for(int i = 1; i <nums.length; i++){
            if(nums[i] == nums[i-1]) {
                continue;
                //skip iteration for duplicates
            }
            
          //  if current num and prev num are same count ++
          // 2 == 1+1
          // 1 == 0+1
          // 0 == -1+1 
          if(nums[i]==nums[i-1]+1)
          {
             System.out.print(" "+nums[i]);
             count++;
          }else {
            //if above case (means consecutive case) breaks reset count
                count = 1;
            }
            //max count
            maxCount = Math.max(maxCount, count);
          
        }
        return maxCount;
    }
}
