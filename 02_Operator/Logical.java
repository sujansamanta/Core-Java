
public class Logical {
    public static void main(String[] args) {
        int p = 10, q = 15, r = 20;

        // && Operator
        System.out.println((p<q) && (q<r));
        System.out.println((p<q) && (q>r));

        // || operator
        System.out.println((p<q) || (q<r));
        System.out.println((p<q) || (q>r));
        System.out.println((p>q) || (q>r));

        // ! operator
        System.out.println(!(p<q));
        System.out.println(!(p==q));
        System.out.println(!(p>q));
        System.out.println(!(p<r));
        System.out.println(!(p>=q));
    }
    
}
