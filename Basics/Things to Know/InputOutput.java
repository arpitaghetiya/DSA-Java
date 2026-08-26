import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println("Enter your Age: ");
        int age=sc.nextInt();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);

        sc.close();
    }
}
