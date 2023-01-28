package chap_04;

public class _Quiz_Class {
    public static void main(String[] args) {


        Hamburger[] hamburgers =new Hamburger[3];
        hamburgers[0]=new Hamburger();
        hamburgers[1]=new CheeseBurger();
        hamburgers[2]=new FishBurger();

        System.out.println("--- 주문하신 메뉴를 만듭니다. --");
        for(Hamburger burger:hamburgers){
            System.out.println(burger.name+" 만듭니다");
            System.out.print("주문하신 메뉴의 재료 : ");
            burger.cook();
            System.out.println("---------------------");
        }

        System.out.println("메뉴 준비가 완료되었습니다.");
    }

}


class Hamburger{
    String name;
    String cook;

    Hamburger(){
        this.name="기본 햄버거";
        this.cook="양상추, 패티, 피클";
    }
    Hamburger(String name){
        this();
        this.name=name;
    }

    void cook(){
        System.out.println(this.cook);
    }
}

class  CheeseBurger extends  Hamburger{
    CheeseBurger(){
        super("치즈버거");
        this.cook =super.cook+", 치즈";
    }
}

class  FishBurger extends  Hamburger{
    FishBurger(){
        super("새우버거");
        this.cook =super.cook+", 새우";
    }
}


