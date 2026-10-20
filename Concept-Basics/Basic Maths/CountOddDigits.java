public class CountOddDigits {
    public static void main(String[] args) {
        int counter=0;
        int num=1234;

        
        while(num!=0){
            int digit= num%10;

        if(digit%2!=0){
            counter++;
        }
            num=num/10;
        }
        System.out.println(counter);
        }
    }