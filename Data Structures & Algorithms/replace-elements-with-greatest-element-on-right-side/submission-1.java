class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxRight = arr[arr.length -1];

        for(int i = arr.length - 2; i >= 0; i--){
            int temp;

            if(arr[i] > maxRight){
                temp = arr[i];
                arr[i] = maxRight;
                maxRight = temp;
            }
            else{
                arr[i] = maxRight;
            }

        }
   




        arr[arr.length - 1] = -1;

        return arr;

    }
}