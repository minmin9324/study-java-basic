package chap_03;

public class _02_ASCII {
    public static void main(String[] args) {
      // 아스키 코드 (ASCI) : 미국 표준 코드
        //char 는 아스키코드 기준으로 계산 가능.
        char chr='A';

        System.out.println(chr); // A
        System.out.println((int)chr); //65

        chr = 'B';
        System.out.println(chr); // B
        System.out.println((int)chr); //65

        chr++;
        System.out.println(chr); // C
        System.out.println((int)chr); // 66
    }
}
