class Solution {
    public int[] twoSum(int[] numbers, int target) {
      // HashMap<Integer, Integer> map = new HashMap<>();
      //     for(int i = 1; i < numbers.length; i++){
      //       int complement = target - numbers[i];
      //       if(map.containsKey(complement)){
      //           return new int[]{map.get(complement),i};
      //       }
      //       map.put(numbers[i], i);
      //   }
      //   return new int[]{-1,-1};

      for(int i = 0; i < numbers.length; i++){
        for(int j = i+1; j < numbers.length; j++){
            if(numbers[i]+numbers[j]==target){
              return new int[]{i+1, j+1};
            }
        }
      }
      return new int[]{-1, -1};
     }
}
