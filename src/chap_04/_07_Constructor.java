package chap_04;

public class _07_Constructor {
    public static void main(String[] args) {
     BlackBox box1=new BlackBox();
        System.out.println(box1.name+box1.resolution);
        box1.color="red";
        box1.name="까망이";
        box1.resolution="FHD";
        System.out.println(box1.name+box1.resolution+box1.price+box1.color);
        System.out.println("box1 indexNum :"+box1.indexNum);
        System.out.println();

        BlackBox box2=new BlackBox("하양이","UHD",5000,"white");
        System.out.println(box2.name+box2.resolution+box2.price+box2.color);
        System.out.println("box2 indexNum :"+box2.indexNum);
    }
}
