package chap_04;

import chap_04.camera.Camera;
import chap_04.camera.FireCamera;
import chap_04.camera.FireCamera_inheritance;
import chap_04.camera.SpeedCamera_inheritance;

public class _14_Super {
    // super을 통해서 부모 메소드나 변수에 접근할 수 있음.
     // 부모 class에 있는 메소드에 추가 적인 행동을 하고싶을 경우 오버라이딩해서
    // 메소드안의 같은걸 다시 적어준다음 추가로 할 행동을 구현해야하는데
    // super.메소드() 를 하면 부모class에 있는 메소드가 실행되므로 추가적인 행동만 구현하면됨.
    // ex
    public static void main(String[] args) {
        SpeedCamera_inheritance speedCamera=new SpeedCamera_inheritance();
        FireCamera_inheritance fireCamera1 =new FireCamera_inheritance();
        FireCamera_inheritance fireCamera2 =new FireCamera_inheritance("두번째 화재감지 카메라");

        speedCamera.takePicture();
        fireCamera1.takePicture();
        fireCamera2.takePicture();

    }
}
