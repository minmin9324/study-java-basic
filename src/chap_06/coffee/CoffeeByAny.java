package chap_06.coffee;

public class CoffeeByAny {


    public Object name;  // Integer, String, Blackbox 등 객체면 다 받을 수 있

    public CoffeeByAny(Object name){
        this.name=name;
    }

    public  void  ready(){
        System.out.println("커피준비 완료 : " +name);

    }

}
