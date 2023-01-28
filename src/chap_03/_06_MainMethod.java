package chap_03;

public class _06_MainMethod {

    // main method
    // java 가 실행될때 가장 처음 실행되는 곳
    // void -> 반환값 없음 .
    //  string으로된 배열을 인자값으로 받는 메소드 -> 프로그램에서 전달받는 값.

    public static void main(String[] args) {

        for (String str:args) {
            System.out.println(str);
        }

        // 1. 조회 , 2. 대출 , 3. 반납
        if(args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("조회입니다.");
                    break;
                case "2":
                    System.out.println("대출");
                    break;
                case "3":
                    System.out.println("반남입니다.");
                    break;
                default:
                    System.out.println("잘못입력했습니다.");

            }
        }else {
            System.out.println("하나의 번호만");
        }





    }
}
