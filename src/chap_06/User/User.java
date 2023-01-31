package chap_06.User;

public class User {
    public String name;

    public User(String name){
        this.name=name;

    }

    public void  addPoint(){
        System.out.println(this.name + "님 적립되었습니다.");
    }
}
