package chap_04.camera;

public class Camera {
    public String name;

    public Camera() {

        this("기본 카메라");
    }
    public Camera(String name) {
        this.name=name;
    }


    public void takePicture(){
        System.out.println(this.name + "찰칵");
    }
    public void recordVideo(){
        System.out.println(this.name + "녹화");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능은 : 사진활영, 동영상 녹화");
    }
}
