
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.print("Please enter your number: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int numOfDigits=0;
        int Original_n=n;

        while(n>0){
            n=n/10;
            numOfDigits++;
        }
        System.out.println("Number of digits in "+ Original_n + " = " + numOfDigits);
    }
    
}
