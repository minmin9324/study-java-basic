package chap_03;

public class _04_Overloading {
    // 메소드 오버로딩 -> 같은 이름의 메소드를 여러 번 선언.
    // 인자의 개수나 인자의 타입이 다르면 같은 네이밍을 사용할수있다.
    public  static int plus (int num1,int num2) {
        int result =num1+num2;
        return  result;
    }

    public  static int plus (String num1,String num2) {
        int result =Integer.parseInt(num1) +Integer.parseInt(num2) ;
        return  result;
    }

    public  static int plus (String num1,String num2,String num3) {
        int result =Integer.parseInt(num1) +Integer.parseInt(num2)+Integer.parseInt(num3) ;
        return  result;
    }




    public static void main(String[] args) {
        // 메소드 호출
        System.out.println(plus(2,3));
        System.out.println(plus("2","3"));
        System.out.println(plus("2","3","4"));


    }
}
