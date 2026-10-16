public class LCM {
    public static void main(String args[]){
        int a=4;
        int b=6;
        int x=a;
        int y=b;

        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }

        int gcd=a;
        int lcm=(x*y)/gcd;
        System.out.println(lcm);

    }
}
