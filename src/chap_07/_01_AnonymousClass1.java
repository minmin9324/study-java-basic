package chap_07;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {

        Coffee coffee1 =new Coffee();
        coffee1.order("아메리카노");

        Coffee coffee2 =new Coffee();
        coffee2.order("아메리카노오오오오");



        // 익명 클래스 예시 1 ->  Coffee클래쓰를 확장하여 specialCoff 하나의 객체만을 위한 1회성 클래쓰
    Coffee specialCoff =new Coffee(){
        @Override
        public void order(String coffee) {
            super.order(coffee);
            System.out.println("딸기케이크는 서비스에요 ");
        }

        @Override
        public void returnTray() {
            System.out.println("넌 두고가도됨");
        }
    };

        specialCoff.order("바닐라라떼");
        specialCoff.returnTray();
    }

}

class Coffee {
    public void  order(String coffee){
        System.out.println("주문하신 "+ coffee + " 나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 먹으신건 치워주세요");
    }
}