package chap_04;

public class _01_Class {
    public static void main(String[] args) {
        // 객체지향 프로그래밍 -> OOP : object-oriented-programming  유지보수 용이, 높은 재사용성

        String[] items ={"CPU","RAM"};


        // 블랙박스
        //모델명, 해상도 , 가격, 색상
        String name="까망이";
        String resolution="FHD";
        int price=20000;
        String color="black";

        // 새로운 제픔 개발
        String name1="하양이";
        String resolution1="UHD";
        int price1=40000;
        String color1="white";

        //또 새로운
        BlackBox box3=new BlackBox();  // BlackBox클래스로부터 객체생성, box3는 BlackBox 클래스의 인스턴스
        // box3 -> 객체, BlackBox 클래스의 인스턴스
        BlackBox box4=new BlackBox();


        // 인스턴스의 variables


    }
}
