package chap_06;

import chap_06.User.User;
import chap_06.User.VIPUser;
import chap_06.coffee.*;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber coffeeByNumber=new CoffeeByNumber(98);
        CoffeeByNickname coffeeByNickname=new CoffeeByNickname("유재석");

        coffeeByNumber.ready();
        coffeeByNickname.ready();


        System.out.println("----------");

        CoffeeByAny coffeeByAny1=new CoffeeByAny("망고");
        CoffeeByAny coffeeByAny2=new CoffeeByAny(32);

        coffeeByAny1.ready();
        coffeeByAny2.ready();

        // object 형으로 name을 받을경우 형변환이 필요
        String any1Name=(String)coffeeByAny1.name;
        System.out.println("주문 고객 정보 : " +any1Name);
        int any2Name=(int)coffeeByAny2.name;
        System.out.println("주문 고객 번호 : "+ any2Name);



        Coffee<Integer> coffee1=new Coffee<>(56);
        coffee1.ready();
        // 제네릭으로 만들 경우 형변환이 필요 없다.
        int coff1=coffee1.name;

        Coffee<String> coffee2=new Coffee<>("mangoo");
        coffee2.ready();
        String coff2=coffee2.name;
        System.out.println("주문 고객 정보 : " + coff1 + coff2);


        User user=new User("최정민");
        VIPUser vipUser=new VIPUser("mango");
        user.addPoint();
        vipUser.addPoint();


        CoffeeByUser<User> coffeeByUser =new CoffeeByUser<>(new User("최정민망고"));
        coffeeByUser.ready();

        CoffeeByUser<User> coffeeByUserVip = new CoffeeByUser<>(new VIPUser("최정민vip"));
        coffeeByUserVip.ready();

        orderCoffee("최정민","카페라떼");
        orderCoffee("오오오옹","바닐라라떼");

    }

    public static <T,C> void orderCoffee(T name,C coffee){
        System.out.println(coffee+" 준비롼료 : " + name);
    }
}
