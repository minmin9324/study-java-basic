package chap_04;

import chap_04.camera.ActionCam;
import chap_04.camera.Camera;
import chap_04.camera.SlowCam;

public class _15_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data types) int , float, double,long,boolean  -> 기본값을 가진다., 메소드가 없다.
        int[] i =new int[2];
        double[] d=new double[2];
        float[] f=new float[2];
        boolean[] b=new boolean[2];
        System.out.println(i[0]);
        System.out.println(d[0]);
        System.out.println(f[0]);
        System.out.println(b[0]);


        // 참조 자료형 (Non-Primitive Data types, Reference Data types) String,Camera, FireCamera...  -> 기본값없이 null이다. 메소드를 가질수 있다. , 대문자로 시작한다.
        // 주소값을 참조한다.
        // 깊복 얕복
        String[] s =new String[3];
        Camera[] ca =new Camera[3];
        System.out.println(s[0]); // null
        System.out.println(ca[0]); // null



        // Final -> 상속했을 경우 바꿀수 없다., class 앞에 썼을 경우엔 상속할수도 없다.
        ActionCam actionCam =new ActionCam("표준렌즈");
        // actionCam.lens = "표준렌즈";  final을 썻기때문에 어떤 경우에도 바꿀 수 없다.
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowCam slowCam =new SlowCam();
        // actionCam.lens = "표준렌즈";  final을 썻기때문에 어떤 경우에도 바꿀 수 없다.
        slowCam.recordVideo();
        slowCam.makeVideo();



    }
}
