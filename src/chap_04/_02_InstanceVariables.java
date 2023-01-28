package chap_04;

public class _02_InstanceVariables {
    public static void main(String[] args) {
      BlackBox box1=new BlackBox();
      box1.color="red";
      box1.name="까망이";
      box1.resolution="FHD";

      System.out.println(box1.color);
      System.out.println(box1.name);


      // 새로운 블랙박스
        BlackBox box2=new BlackBox();
        box2.color="white";
        box2.name="하양이";
        box2.resolution="UHD";
    }
}
