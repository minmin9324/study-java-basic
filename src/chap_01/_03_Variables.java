package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String mango = "mango";   // 문자열 변수 (원시 자료형(=primitive 자료형)은 아님. 리터럴 표현식을 사용할수 있도록 특별대우해주는 자료형)
        String purple;
        purple="purple";

        double score = 99.5;
        char grade = 'A';

// 원시 자료형


        // 논리형 - true or false
        boolean isTrue = false;

        // 문자형 - 2byte 크기 ,65536개의 값을 표현, 문자를 나타내는 정수값이 저장되고 출력이 문자로 표현됨 (컴터의 모든 데이터는 숫자로 표현되기때문)
        char charEx ='a';

        // 정수형 - byte,short,int,long 4가지, 크기 long(8byte) > int(4byte) > short > byte , Long 은 대소문자 상관없이 L or l을 붙여줌.
        int num = 3;
        long numLong=100000000000000024l;
        long numLong2=1_000_000_000_000_000_24l;

        // 실수형 float, double 2가지 타입, float-4byte, double-8byte, float 은 대소문자 상관없이 F or f을 붙여줌.
        double d=3.12345678;
        float f=3.124234F;

        System.out.println(mango + score + grade);
        System.out.println(d);
        System.out.println(f);
        System.out.println(num);
        System.out.println(numLong);
        System.out.println(numLong2==numLong);
        System.out.println(charEx);
        System.out.println(isTrue);


        // 상수 - 절대 변하지 않는값 final
        final String NAME = "asdfasdf";
        System.out.println(NAME);
    }
}


