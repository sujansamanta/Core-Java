
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is :" + name);

        System.out.print("Enter your lucky number:");
        int num1 = sc.nextInt();
        System.out.println("Lucky number is:" + num1);
    }
}
