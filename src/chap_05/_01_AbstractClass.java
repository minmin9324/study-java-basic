package chap_05;

import chap_05.Camera.Camera;
import chap_05.Camera.FactoryCam;
import chap_05.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) abstract
        // 추상 클래스 (아직 완성되지않은 클래스)
        // 추상클래스는 객체를 생성할 수 없다 상속 받은 자식 class들만 객체 생성이 가능함.
        // Camera camera =new Camera();

        // 추상 메소드 (추상 클래스에서만 사용가능한, 껍데기만 있는 메소드 ) -> 상속 받은 class는 반드시 추상메소드에 대해 구현해줘야함.

        FactoryCam factoryCam=new FactoryCam();
        SpeedCam speedCam =new SpeedCam();

        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
