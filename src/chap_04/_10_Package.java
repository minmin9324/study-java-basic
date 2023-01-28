package chap_04;

import java.util.Random;

public class _10_Package {
    public static void main(String[] args) {
        // 패키지 -> 폴더 구조 , 연관된 클래스를 묶어두는것.

        // 랜더클래스
        Random random =new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 범위 내의 정수
        System.out.println("랜덤 정수 범위 : " + random.nextInt(10)); // 0이상 10미만 정수
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0이상 1.0미만의 실수값
        System.out.println("랜덤 boolean : " + random.nextBoolean()); // true or false


        // 만약 5.0이상 10.0 미만의 실수를 뽑을려면 ?
        double min =5.0;
        double max =10.0;
        System.out.println(min+(max-min)*random.nextDouble());

        // 로또 범위를 뽑을려면 ? 1~45
        System.out.println("로또 : " + random.nextInt(45)+1); // 1이상 46미만 정수  -> 1~45


    }
}
