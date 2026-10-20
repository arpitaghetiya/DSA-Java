public class PerfectNumber {
    public static void main(String[] args) {
        int num=8;
        int sum=0;

        for(int i=1; i<num; i++){
            if(num % i==0){
                sum=sum+i;
            }

        }
        if(sum==num){
                System.out.println("Perfect number");
            }
            else{
                System.out.println("Not a perfect number");
            }
    }
}
