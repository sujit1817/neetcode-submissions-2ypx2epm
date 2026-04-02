class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                // Closing bracket — stack must not be empty
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(c == ')' && top!= '(') return false;
                if(c == '}' && top!= '{') return false;
                if(c == ']' && top!= '[') return false;
            }
        }
         // Valid only if all brackets were matched
        return stack.isEmpty();
    }
}
