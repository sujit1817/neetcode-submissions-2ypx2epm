class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
/*
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
        */

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
             map.put(c, map.getOrDefault(c, 0)+1);
        }
//       System.out.println(map);
// {a=2, r=2, c=2 ,e=1}
        for(char c : t.toCharArray()){
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1);
            if(map.get(c)==0)map.remove(c);
        }

        return map.isEmpty();
        // r 2
        // a 2


    }
}
