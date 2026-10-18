class Solution {
    public boolean isPowerOfTwo(int n) {
        long result=1;
        while(result<n){
            result=result*2;
        }
        if(result==n) return true;
        else return false;
    }
}