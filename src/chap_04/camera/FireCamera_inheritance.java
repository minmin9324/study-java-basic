package chap_04.camera;

public class FireCamera_inheritance extends Camera  {
//    public FireCamera_inheritance() {
//        this.name = "화재 단속 카메라";
//    }

    public FireCamera_inheritance(){
        super("화재 단속 카메라");
    }
    public FireCamera_inheritance(String name) {
        super(name);
    }

    @Override
    public void takePicture() {
        detectFire();
        super.takePicture();
    }

    public void detectFire(){
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능은 : 사진활영, 동영상 녹화, 화재 감지");
    }

}
