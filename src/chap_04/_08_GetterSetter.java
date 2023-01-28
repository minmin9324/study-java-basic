package chap_04;

public class _08_GetterSetter {
    public static void main(String[] args) {
        BlackBox2 box1=new BlackBox2();
        box1.name="까망이";

        // box1.resolution="FHD";
        box1.price=40000;
        box1.color="black";

        // 할인 모든 price 5처넌 디씨
        //box1.price=box1.price-5000;
        // 실수로
        box1.price=-5000;
        System.out.println("가격 : "+ box1.price);

        // 고객문의 resolution정보를 줘야하는 데 실수로 어떤건지 선언을 안해놈
        System.out.println("해상도 : "+ box1.resolution);

        // --> 이럴때 Getter 와 Setter 사용
        // Getter는 값을 가지고 오는 것, Setter는 값을 설정하는 것  -> blackBox2로 가보자


        BlackBox2 box2=new BlackBox2();
        box2.setPrice(-5000);
        box2.setModelName("하양이");
        box2.setColor("white");

        System.out.println("가격 :"+box2.getPrice());
        System.out.println("해상도 :"+box2.getResolution());

    }
}
