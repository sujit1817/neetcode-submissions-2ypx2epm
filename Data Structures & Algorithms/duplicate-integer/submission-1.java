class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
          if(!set.add(num)){//if duplicate exists add will return false
          //as duplicate exists return true
            return true;
          }
         
        }
       return false;
    }
}