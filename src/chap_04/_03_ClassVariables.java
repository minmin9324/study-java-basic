package chap_04;

public class _03_ClassVariables {
    public static void main(String[] args) {
      BlackBox box1=new BlackBox();
      box1.name="까망이";
      System.out.println(box1.name);

      BlackBox box2=new BlackBox();
      box2.name="하양이";
      System.out.println(box2.name);


      // 특정범위를 초과하는 충돌감지 자동신고 기능 개발 여부
      System.out.println("-- 개발전 --");
      System.out.println(box1.name + " 자동신동기능 "+box1.canAutoReport);
      System.out.println(box2.name + " 자동신동기능 "+box2.canAutoReport);
      System.out.println("모든 블랙스 제품자동신고기능 : "+ BlackBox.canAutoReport);

      // 기능개발
      BlackBox.canAutoReport=true;

      System.out.println("-- 개발후 --");
      System.out.println(box1.name + " 자동신동기능 "+box1.canAutoReport);
      System.out.println(box2.name + " 자동신동기능 "+box2.canAutoReport);
      System.out.println("모든 블랙스 제품자동신고기능 : "+ BlackBox.canAutoReport);

      System.out.println("-- 값 할당 전 기본값 --");
      System.out.println(box1.price);
      System.out.println(box2.price);

      System.out.println("-- box1한테만 새로값 할당 --");
      box1.price=50000;
      System.out.println(box1.price);
      System.out.println(box2.price);

    }
}
