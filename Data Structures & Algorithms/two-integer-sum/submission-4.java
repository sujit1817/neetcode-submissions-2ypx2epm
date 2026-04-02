
class Solution {
	public int[] twoSum(int[] nums, int target) {
		/*
		        task : here we need two elements whose sum == target
		                so
		                        1.hashmap to store number and index
		                         */      Map<Integer, Integer> freqMap = new HashMap<>();

		// 2.calculate complement(each iteration) using target - currentNum
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(freqMap.containsKey(complement)) {
				return new int[] {freqMap.get(complement), i};
			}
			freqMap.put(nums[i], i);
		}

		/* 3.if complement exists in map it means you found the indexes
		        (if point 3 applicable then we can return index of complememt
		                and index of current num)
		                */
		/*
		        for(int i = 0; i<nums.length; i++){
		                  for(int j = i+1; j<nums.length; j++){
		                              if(nums[i]+nums[j]==target){
		                                              return new int[]{i,j};
		                                                          }
		                                                                    }
		                                                                            }
		                                                                                    */

		return new int[] {-1,-1};
	}
}

