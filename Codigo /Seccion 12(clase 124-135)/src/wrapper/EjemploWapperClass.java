package wrapper;

public class EjemploWapperClass {
    public static void main(String[] args) {
        int x = 10;
        Integer x1= new Integer(10); // no se recomienda hacer esto
        Integer x2 = 10 ;

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x1.floatValue());
        String x1String = x1.toString();
        System.out.println(x1String);
        System.out.println(x2);
        System.out.println(x2.floatValue());
    }
}
