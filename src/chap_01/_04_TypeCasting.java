package chap_01;

public class _04_TypeCasting {
    public static void main (String[] args) {
        // 형 변환
        // 장수 -> 실수
        // 실수 -> 정수

        // int to float,double
        int score = 92;
        System.out.println(score);  // 92

        System.out.println((float) score); // 92.0

        System.out.println((double) score); // 92.0

        float score_f=92.2f;
        double score_d=92.2;
        System.out.println((int) score_f); // 92
        System.out.println((int) score_d); // 92

       // score = score + score_f  -> 자료형이 달라 계산불가
        // int -> long -> float -> double 자동 형변환 , 거꾸로는 안됨 -> 형변환해서 계산 필요
        score = score + (int)score_f;
        score_f = (float)score + score_f;
        score_f = score + score_f;
        System.out.println(score_f); // 184.4


        // 숫자를 문자열로
        String num =String.valueOf(40.6); // 방법 1
        num = Integer.toString(30); // 방법 2 (int -> string)
        num = Double.toString(30.12); // 방법 2  (double -> string)

        System.out.println(num);

        // 문자열을 숫자로
        int str=Integer.parseInt("93");
        System.out.println(str);
        double dStr=Double.parseDouble("39.9");
        System.out.println(dStr);

       // int error =Integer.parseInt("자바"); // error 남  "자바"는 숫자로 바꿀수없기때문
    }
}


