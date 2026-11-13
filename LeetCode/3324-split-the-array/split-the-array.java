class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];

        for(int arr : nums){
            if(++count[arr] > 2){
                return false;
            }
        }
        return true;
    }
}