package chap_03;

public class _03_Method {
    // 메소드 정의


    // void 반환값없음
    public  static void hello () {
        System.out.println("안녕 ?");
    }

    // int 반환값 int형
    public  static int plus (int num1,int num2) {
        System.out.println(num1+num2);
        int result =num1+num2;
        return  result;
    }

    public  static String str (int num1,int num2) {
        System.out.println(num1+num2);
        String result = Integer.toString(num1+num2);
        return result;
    }

    public static void main(String[] args) {
        // 메소드 호출
        hello();
        System.out.println(plus(2,3));
        System.out.println(str(2,3));
    }
}
