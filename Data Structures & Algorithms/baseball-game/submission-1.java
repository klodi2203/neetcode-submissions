class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];
            switch(op){
                case "+" -> {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last+secondLast);
                    sum += (last+secondLast);
                }
                case "C" -> {
                    int removed = stack.pop();
                    sum -= removed;
                }
                case "D" -> {
                    int last = stack.peek();
                    int lastDouble = 2 * last;
                    stack.push(lastDouble);
                    sum += lastDouble;
                }
                default -> {
                    int num = Integer.valueOf(op);
                    stack.push(num);
                    sum += num;
                } 
            }
        }

        

        return sum;
        
    }
}