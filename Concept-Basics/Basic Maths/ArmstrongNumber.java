public class ArmstrongNumber {
    public static void  main(String args[]){
        int num=153;
        int original=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            int cube=digit*digit*digit;
            sum=sum+cube;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong number!!");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
