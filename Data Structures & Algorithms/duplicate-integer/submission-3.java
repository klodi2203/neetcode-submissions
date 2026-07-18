class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> seenNumbers = new HashSet<>();

        boolean duplicates = false;

        for(int i = 0; i < nums.length; i++){

            if(!seenNumbers.contains(nums[i])){
                seenNumbers.add(nums[i]);
            }
            else{
                duplicates = true;
            }
        }

        return duplicates;



    }
}