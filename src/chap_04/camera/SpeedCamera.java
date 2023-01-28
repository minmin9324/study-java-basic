package chap_04.camera;

public class SpeedCamera {
    public String name;

    public SpeedCamera() {
        this.name = "과속 단속 카메라";
    }

    public void takePicture(){
        System.out.println(this.name+" 찰칵");
    }
    public void recordVideo(){
        System.out.println(this.name+ " 녹화");
    }

    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        System.out.println("번호판을 인식합니다.");
    }

}
