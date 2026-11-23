class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> min;
    int min_;



    public MinStack() {
        stack = new ArrayList<>();
        min = new ArrayList<>();
        min_ = Integer.MAX_VALUE;   
    }
    
    public void push(int val) {
        stack.add(val);

        if(val <= min_){
            min_ = val;
            min.add(min_);
        }
    }
    
    public void pop() {
        
        
        int element = stack.remove(stack.size()-1);

        if(min.get(min.size() -1) == element){
            min.remove(min.size() - 1);
            if(!min.isEmpty()){
                min_ = min.get(min.size()-1);
            }
            else{
                min_ = Integer.MAX_VALUE;
            }
            
        }

    }
    
    public int top() {
        return stack.get(stack.size() -1);
    }
    
    public int getMin() {
        return min_;
    }
}
