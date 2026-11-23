class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            
            char par = s.charAt(i);

            if(par == '(' || par == '{' || par == '[' ){
                stack.push(par);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if( (top == '[' && par == ']')
                 || (top == '{' && par == '}')
                 || (top == '(' && par == ')')){
                    stack.pop();
                 }
                else{
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}


