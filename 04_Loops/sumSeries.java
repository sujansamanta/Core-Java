
import java.util.Scanner;

public class sumSeries {
    public static void main(String[] args) {
        System.out.print("Enter the nth number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;

        for(int i=1; i<=n;i++){
            if(i%2 ==0){
                ans -= i;
        } else {
            ans +=i;
        }
       
    }
    System.out.println("Sum of the series is: "+ ans);
}
}
