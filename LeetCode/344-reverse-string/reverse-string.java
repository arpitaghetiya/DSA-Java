class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0; i<n/2; i++){
            char left=s[i];
            char right=s[n-1-i];
            s[n-1-i]=left;
            s[i]=right;
        }
    }
}