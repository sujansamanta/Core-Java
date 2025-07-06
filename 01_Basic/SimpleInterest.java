
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle(Amount): ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.print("Enter time(Year): ");
        float t = sc.nextFloat();


        float si = (p*r*t)/100;
        
        System.out.println("Total Simple Interest is:"+ si);
    }
    
}
