package chap_04;

import chap_04.camera.Camera;
import chap_04.camera.FireCamera_inheritance;
import chap_04.camera.SpeedCamera_inheritance;

public class _13_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : (학생은 사람이다. Student is a Person)
        // class Teacher extends Person : (선생님은 사람이다. Teacher is a Person)


        Camera camera =new Camera();
        Camera speedCamera=new SpeedCamera_inheritance();
        Camera fireCamera =new FireCamera_inheritance();
        // 다형성  -> 부모 class로 다양한 class를 만들수있다.


        camera.showMainFeature();
        speedCamera.showMainFeature();
        fireCamera.showMainFeature();


        Camera[] cameras =new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new SpeedCamera_inheritance();
        cameras[2] = new FireCamera_inheritance();

        for (Camera cam : cameras){
            cam.showMainFeature();
        }


        // but 형태가 부모class로 정해졌기때문에 자식class에만 있는 메소드나 변수는 사용할 수 없다.
        // speedCamera.recognizeLicensePlate(); 사용못함.

        // java에는 어떤 객체가 어떤 클래스의 instance인지 확인할수있는 instanceof라는 메소드가 있다.
        // 이걸 활용하여 형변환을 통해 speedCamera.recognizeLicensePlate(); 사용해보자.
        System.out.println("-----------------");
        if(camera instanceof Camera){
            camera.showMainFeature();
        }

        if(cameras[1] instanceof SpeedCamera_inheritance){
          ((SpeedCamera_inheritance) cameras[1]).recognizeLicensePlate();
        }

        if(cameras[2] instanceof FireCamera_inheritance){
            ((FireCamera_inheritance) cameras[2]).detectFire();
        }

    }
}
