class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //top K elements from the array
        //use hashmap store num as key and frequency as value
        //then we have to think
      List<Integer>[] bucket = new List[nums.length+1];
      //This is an bucket Array which contain a list at each index 

      Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
          map.put(num, map.getOrDefault(num, 0)+1);
        }



      for(int key : map.keySet()){//key is the num 
        int frequency = map.get(key);// frequency contains value
        if(bucket[frequency]==null){//if frequency is null
          bucket[frequency] = new ArrayList<>();//create new ArrayList in bucket
        }
        //else in the bucket which has list add key 
        bucket[frequency].add(key);
        //[1,2,2,3,3,3]
        //{[],[1],[2],[3],[]}
 //index   0   1   2   3   4 

      }

      // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        // {
        //   1 = 1,
        //   2 = 2,
        //   3 = 3
        // }


      //  return new int[]{};
      return result; // fallback (though we always return earlier)
    }
}
