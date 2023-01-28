package chap_04;

import chap_04.camera.*;

public class _12_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버로딩 -> 같은 클래스 내에 이름같고 매개변수(파라미터)의 형태나 갯수가 다를경우 사용할수있는것
        // 메소드  오버라이딩 -> 자식클래스에서 부모클래스의 메소드를 덮어쓰기 , 재정의
        Camera camera =new Camera();
        SpeedCamera_inheritance speedCamera=new SpeedCamera_inheritance();
        FireCamera_inheritance fireCamera =new FireCamera_inheritance();

        camera.showMainFeature();
        speedCamera.showMainFeature();
        fireCamera.showMainFeature();



    }
}
