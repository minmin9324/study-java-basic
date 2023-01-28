package chap_04_public_test;

import chap_04.BlackBoxRefurbish;

public class _09_AccessModifier_test {
    public static void main(String[] args) {
        BlackBoxRefurbish Box1=new BlackBoxRefurbish();
        // 다른 패키지에 있음으로 public 에만 접근가능하다.
        Box1.name="까망이";  // public 접근가능
        System.out.println(Box1.name);

        //  Box1.resolution; default 라서 접근 불가능
        //  Box1.price; private 이라 접근 불가능
        //  String Box1.color;  protected 라 다른패키지에서는 자식 클래스여야 접근가능하지만 아니기 때문에 안됨.

        Box1.setPrice(30000);
        System.out.println(Box1.getPrice());
    }
}
