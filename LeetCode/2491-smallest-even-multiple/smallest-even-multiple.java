class Solution {
    public int smallestEvenMultiple(int n) {
        int a=2;

        int x=a;
        int y=n;

        while(n!=0){
            int rem=a%n;
            a=n;
            n=rem;
        }

        int gcd=a;
        int lcm=(x*y)/gcd;
        return lcm;
    }
}