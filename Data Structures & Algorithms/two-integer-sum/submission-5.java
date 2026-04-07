class Solution {
    public int[] twoSum(int[] nums, int target) {
                    //sum of two elemets with which target
            //return index

        HashMap<Integer, Integer> map = new HashMap<>();
      //  to return the index
     ///   we need two numbers in array who are having sum equal to target
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
        
        // 3, 4, 5, 6
        // target 7
        // 3+4 sum
        // number will be key
        // 0 1 index

        // target - current num = complement
        // 9 - nums[i] =
        // 9 - 3 = 4
        // 4 exists ? return index : put(nums[i], i)

      //  nums at index is key and index will be value in map

  /*  O(n*n)          
        for(int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
             if(nums[i]+nums[j] == target) {
                return new int[]{i,j};
            }
        }
        }
        return new int[]{-1,-1};
*/

    }
    
}
