
import java.util.Scanner;
public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.err.println("Enter Scond Number:");
        int num2 = sc.nextInt();
        int sum= num1+num2;
        System.err.println("Sum Of Two numbers is :" + sum);

    }
    
}
