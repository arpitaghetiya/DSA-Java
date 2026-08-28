import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]){
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Value of i is: " + i);
        }
    sc.close();

    }
}
