public class PalindromeNumber {

    public static void main(String[] args) {
        int num=121;
        int reverse=0;
        int original = num;

        while (num!=0) {
            int digit= num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        
        if(reverse==original){
            System.out.println("Palindrome number!!");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
