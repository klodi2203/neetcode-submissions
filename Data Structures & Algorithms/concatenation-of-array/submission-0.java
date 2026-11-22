class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int capacity = nums.length * 2;
        int len = nums.length;
        int[] ans = new int[capacity];


        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }

        return ans;
    }
}