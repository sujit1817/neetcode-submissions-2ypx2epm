class Solution {
    public int[] productExceptSelf(int[] nums) {
      //  nums[i] = product of nums[i-1] and greater upto end

      int n = nums.length;
      int[] result = new int[n];

      result[0] = 1;
      //build leftpart
      for(int i = 1; i< nums.length; i++){
        result[i] = result[i-1] * nums[i-1];
      }

      //build right part
       int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }


      return result;
    }
}  
