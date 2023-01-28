package chap_04.camera;

public class FireCamera {
    public String name;

    Camera camera=new Camera();
    public void Camera_a(){
        System.out.println(camera.name);
    }
    public FireCamera() {
        this.name = "화재 단속 카메라";
    }

    public void takePicture(){
        System.out.println(this.name+" 찰칵");
    }
    public void recordVideo(){
        System.out.println(this.name+" 녹화");
    }
    public void detectFire(){
        System.out.println("화재를 감지합니다.");
    }

}
