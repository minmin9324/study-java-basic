package chap_04;

import chap_04.camera.*;

import java.util.Random;

public class _11_Inheritance {
    public static void main(String[] args) {
        // 상속 -> 같은 기능이 반복될때  , extends 클래스
        // 상속은 하나의 클래스에서만 상속받을수 있다.  extends 클래스,클래스 안됨.

        Camera camera =new Camera();
        SpeedCamera speedCamera=new SpeedCamera();
        FireCamera fireCamera =new FireCamera();

        System.out.println(camera.name);
        System.out.println(speedCamera.name);
        System.out.println(fireCamera.name);

        System.out.println("------");

        camera.takePicture();
        fireCamera.recordVideo();
        speedCamera.checkSpeed();

        System.out.println("-----------------");

        SpeedCamera_inheritance speedCameraInheritance=new SpeedCamera_inheritance();
        FireCamera_inheritance fireCameraInheritance =new FireCamera_inheritance();

        System.out.println(speedCameraInheritance.name);
        System.out.println(fireCameraInheritance.name);

        System.out.println("------");

        fireCameraInheritance.takePicture();
        speedCameraInheritance.takePicture();




    }
}
