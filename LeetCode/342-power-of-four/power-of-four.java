class Solution {
    public boolean isPowerOfFour(int n) {
        long res=1;
        while(res<n){
            res=res*4;
        }
        if(res==n) return true;
        else return false;
    }
}