public class CountDigits {
    public static void main(String[] args) {
        int counter=0;
        int num=1234;

        while(num!=0){
        num=num/10;
        counter++;
    }    
    System.out.println(counter);
}
}
