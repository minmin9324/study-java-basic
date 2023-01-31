package chap_06.coffee;

import chap_06.User.User;

public class CoffeeByUser <T extends User>{
    public T user;
    public CoffeeByUser(T user){
        this.user=user;

    }

    public void  ready(){
        System.out.println("포인트 적립 : "+this.user.name);
        user.addPoint();
    }

}
