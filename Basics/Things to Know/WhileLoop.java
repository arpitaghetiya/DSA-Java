import java.util.Scanner;
public class WhileLoop {
    public static void main(String args[]){
        System.out.print("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println("Value of i is: " + i);
            i++;
        } 
        sc.close();
    }
}
