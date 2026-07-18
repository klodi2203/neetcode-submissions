class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        boolean duplicates = false;

        for(int i = 0; i < nums.length; i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                duplicates = true;
            }
        }

        return duplicates;



    }
}