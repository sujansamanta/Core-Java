public class Bitwise{
    public static void main(String[] args) {
        int p =9, q = 10;
        System.out.println(p | q);  //11
        System.out.println(p & q);  // 8
        System.out.println(p ^ q);  // 3

        System.out.println(p << 1);
        System.out.println(p << 2);

        System.out.println(q >> 1);
        System.out.println(q >> 2);

    }
}