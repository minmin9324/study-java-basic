package chap_06;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // Wrapper class
        // int double float char
        Integer num=36;
        Double d=1.2;
        Character c='A';
        System.out.println(num);
        System.out.println(d);
        System.out.println(c);


        System.out.println("----------");
        System.out.println(num.intValue());
        System.out.println(d.intValue());
        System.out.println(d.doubleValue());
        System.out.println(c.charValue());
        System.out.println("----------");
        String a =num.toString();
        System.out.println(a);

    }
}
