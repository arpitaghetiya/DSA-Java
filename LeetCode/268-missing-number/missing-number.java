class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=len*(len+1)/2;
        int realSum=0;
        for(int num: nums){
            realSum=realSum+num;
        }
        return sum-realSum;
    }
}