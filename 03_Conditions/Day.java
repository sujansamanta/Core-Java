import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        System.out.print("Enter day Number:");

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.err.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.err.println("THUSDAY");
                break;
            case 5:
                System.err.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.err.println("SUNDAY");
                break;
            default:
                System.out.println("invalid day number");;
        }
    }
}
