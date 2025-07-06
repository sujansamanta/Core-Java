import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=12){
            System.out.println("child");
        }else if(age>12 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Adult");
        }
    }
}
