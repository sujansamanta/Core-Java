import java.util.Scanner;

public interface rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Stars: " );
        int c = sc.nextInt();

        for(int i=1; i <= r; i++){
            for (int j=1; j <= c; j++){
                if(i ==1 || i==r || j==1|| j==c )
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
