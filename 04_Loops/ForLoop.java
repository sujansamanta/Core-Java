import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Enter the n th number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int num;
        System.out.println("Numbers in Decresing order:");
        for(num = n; num >=1; num--){
            sum=sum+num;
            System.out.println(num);
        }
        System.out.println("Sum of the numbers:"+sum);
    }
    
}
