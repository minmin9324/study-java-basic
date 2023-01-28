package chap_04.camera;

public class ActionCam extends Camera{
    public final String lens ;
    public  ActionCam(){
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public  ActionCam(String lens){
        super("액션 카메라");
        this.lens = lens;
    }



    public void makeVideo (){
        System.out.println("비디오 제작 :"+this.name +", 렌즈 : " +this.lens);
    }
}
