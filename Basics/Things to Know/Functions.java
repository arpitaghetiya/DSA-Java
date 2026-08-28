import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        System.out.print("Enter Num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();    

        int sum= add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    }

