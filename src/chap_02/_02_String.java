package chap_02;

public class _02_String {
    public static void main(String[] args) {
        String str = "I like Java .";
        System.out.println(str.substring(str.indexOf("like")+"like ".length(),str.indexOf(".")));


        // 공백제거
        String s = "     i love    java   ";  // i love    java
        System.out.println(s.trim());

        // 문자열 결합
        // 1. + 더하기   2.concat 사용

        // 문자열 비교
        String s1 = "java";
        String s2 = "javaa";
        System.out.println(s1.equals("Java")); // false
        System.out.println(s1.equalsIgnoreCase("Java")); // true


        // 비교 심화
        String s3 = "java";
        String s4 = "java";
        System.out.println(s3.equals(s4)); // true --> 내용비교
        System.out.println(s3 == s4); // true  --> 참조비교 (s3,s4 참조하는 주소값이 동일)

        String s5 = new String("java");
        String s6 = new String("java");

        System.out.println(s5.equals(s6)); // true  --> 내용비교
        System.out.println(s5 == s6); // false  --> 참조비교 (s5,s6 참조하는 주소값이 다름)


        // 특수문자
        // \n 줄바꿈 , \t tab과 같은 기능 , \\ 역슬래시 (\) , \" 큰 따롬표 , \' 작은따옴표
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치\t\t9000원");
        System.out.println("마늘\t\t9000원");
        System.out.println("C:\\Prog");








    }
}
