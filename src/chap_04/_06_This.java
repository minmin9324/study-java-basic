package chap_04;

public class _06_This {
    public static void main(String[] args) {

     BlackBox box1=new BlackBox();
     box1.name ="까망이";

     // 까망이 (최신형) 이렇게 하고싶음.
        box1.appendModalName(" (최신형) ");
        System.out.println(box1.name);

    }
}
