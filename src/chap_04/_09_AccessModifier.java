package chap_04;

public class _09_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
        // 4가지
        // private 해당 클래스 내에서만 접근
        // public 모든 클래스에서 접근 가능
        // default : 아무것도 적지 않았을경우 같은 패키지 내에서만 접근 가능 (예를들면 chap04)
        // protected : 같은 패키지 내에서 접근가능(default와 같음) , 다른 패키지인 경우 자식 클래스인 경우 접근 가능.

// private 해당 클래스 내에서만 접근
        BlackBoxRefurbish box1=new BlackBoxRefurbish();
        box1.name="까망이";
        // box1.price=40000; private이기에 접근불가
        box1.color="black";

       // box1.price=-5000;  private이기에 접근불가  -> setter 이용
        box1.setPrice(-5000);
       // System.out.println("가격 : "+ box1.price); -> getter 이용
        System.out.println("가격 : "+ box1.getPrice());


        BlackBoxRefurbish box2=new BlackBoxRefurbish();
        box2.setPrice(40000);

        System.out.println("가격 :"+box2.getPrice());

        // 객체지향
        //캡슐화
        //관련있는 만큼만
        //정보 은닉
        //직접적인 접근을 막고 객체에서 허용한 메소드를 통해서만 하도록


    }
}
