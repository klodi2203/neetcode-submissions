class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        HashMap<Character,Character> pairs = new HashMap<>();

        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for(char par : s.toCharArray()){
            if(pairs.containsKey(par)){
                if(stack.isEmpty() || stack.peek() != pairs.get(par)){
                    return false;
                }
                else{
                    stack.pop();
                }

            }
            else{
                stack.push(par);
            }
        }

        return stack.isEmpty();

        
    }
}


