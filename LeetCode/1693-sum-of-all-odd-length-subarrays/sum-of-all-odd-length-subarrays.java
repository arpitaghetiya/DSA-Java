class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i ++) {
            total += arr[i] * (((i + 1) * (n - i)  + 1 )/ 2);
        }
        return total;
    }
}