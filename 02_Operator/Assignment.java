public class Assignment {
    public static void main(String[] args) {
        int p=10, q;

        // (= operator)
        q = p;
        System.out.println(q);

        // += operator
        p += q; //p = p+q, p = 10+10,
        System.out.println(p);

        // -= operator
        p -= q; // p = p-q, p=20-10 = 10;
        System.out.println(p);

        // *= operator
        p *= q; // p = p*q: p = 10 * 10 = 100;
        System.out.println(p);

        // /= operator
        p /= q; // p = p/q; p = 100/10 = 10;
        System.out.println(p);


    }
}


