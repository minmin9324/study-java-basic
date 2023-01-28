package chap_02;

public class _04_DoWhile {
    public static void main(String[] args) {

        int move1 = 10;
        // do while은 do가 먼저 실행되고 조건이 맞을때까지 do가 계속 실행
        do {
            System.out.println(move1);
            move1++;
        } while (move1 < 10);
        System.out.println("A도착");

        int move2 = 10;

        // while은  조건이 맞아야 실행
        while (move2 < 10){
            System.out.println(move2);
            move2++;
        }

        System.out.println("B도착");
// 구구단
//        for (int i=2;i<10;i++){
//            for (int j=1;j<10;j++){
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//        }
        int pay = 4000;
        int payOneDay = 30000;
        int sale =50;
        String small = "경차";
        String sick = "장애인";

        int car_time =10;
        String car = "장애인";
        int money = ((car_time * pay)>=payOneDay)?payOneDay:car_time * pay;

        if(car.contains(small)||car.contains(sick)){
            money/=2;
        }

        System.out.println(money);





    }
}