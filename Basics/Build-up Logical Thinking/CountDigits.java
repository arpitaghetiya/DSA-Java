public class CountDigits{
    public static void main(String[] args){
        int N=12345;
        int count=0;
        while(N>0){
            N/=10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}