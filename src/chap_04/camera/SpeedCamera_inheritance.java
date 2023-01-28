package chap_04.camera;

public class SpeedCamera_inheritance extends Camera {
    public SpeedCamera_inheritance() {
        super("과속 단속 카메라");
    }

    @Override
    public void takePicture(){
        checkSpeed();
        super.takePicture();
    }
    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        System.out.println("번호판을 인식합니다.");
    }

    // @Override : annotation -> 이 소스코드를 컴파일 해야만 컴퓨터가 알아들을수 있는 소스코드로 되는것인데 annotation사용하면
    // 컴파일러에게 이 메소드는 지금 부모 클래스의 메소드를 오버라이드 하고 있다 알려주는것 -> 그럼 컴퓨터가 부모class에 이런 메소드가 없을시
    // error를 뱉어준다.

    // * 컴퓨터가 알아들을수 있는 언어로 바꿔주는 행동을 컴파일이라고 함
    // * 컴파일 역할을 하는건 컴파일러.
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능은 : 사진활영, 동영상 녹화, 과속 단속");
    }
}
