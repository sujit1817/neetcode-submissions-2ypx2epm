class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map to store key(sorted String) and value (List of Stringss)
        Map<String, List<String>> map = new HashMap<>();

        //loop through Arrays
        for(String str : strs){
          
          //convert String to char array
            char[] ch = str.toCharArray();
          
          //sort
            Arrays.sort(ch);
          //char array to String key  
            String key = new String(ch);
            
            //check if key present in map
            if(!map.containsKey(key)){
                //if now put key and create new arraylist
                map.put(key, new ArrayList<>());
            }

            //get values from map with key and add the string
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
