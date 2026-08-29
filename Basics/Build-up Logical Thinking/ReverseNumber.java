public class ReverseNumber {
    public static void main(String[] args){
        int N=12345;
        int reverse=0;
        while(N>0){
            int lastDigit= N % 10;
            reverse=reverse*10+lastDigit;
            N=N/10;
        }
        System.out.println("Reversed number:" + reverse);
    }
}
