public class CountPrimesTillN {
    public static void main(String[] args) {

        int count=0;
        int num=9;

        for(int i=2; i<=num; i++){
            boolean isPrime=true;
        
        for(int j=2; j<i; j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            count++;
        }
    }
            System.out.println(count);

}
}
