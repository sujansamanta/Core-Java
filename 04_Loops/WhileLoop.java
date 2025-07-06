import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        System.out.print("Enter the number of iteration:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int sum=0;
        int num =1;

        while(num <= n){
            sum= sum+num;
            num++;
        
        }
        System.out.println(sum);
    }
}