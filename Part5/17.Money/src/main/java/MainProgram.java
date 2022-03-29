
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        //Money a = new Money(10,0);
        //Money b = new Money(5,0);

        //Money c = a.plus(b);

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        //a = a.plus(c);

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        
        //Money a = new Money(10, 0);
        //Money b = new Money(3, 0);
        //Money c = new Money(5, 0);

        //System.out.println(a.lessThan(b));  // false
        //System.out.println(b.lessThan(c));  // true
        
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
