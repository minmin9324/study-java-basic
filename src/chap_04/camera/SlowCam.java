package chap_04.camera;

public class SlowCam extends ActionCam{
    public SlowCam(){
        super("느린 렌즈");
        this.name="슬로우 액션 카메라";
    }



    public void makeVideo (){
        System.out.println("슬로우 비디오 제작 :"+this.name +", 렌즈 : " +this.lens);
    }
}
