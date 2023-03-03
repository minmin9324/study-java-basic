package chap_07;

import chap_07.converter.Convertible;
import chap_07.converter.ConvertibleWithNoParams;
import chap_07.converter.ConvertibleWithTwoParams;
import chap_07.converter.KRWConverter;

public class _04_FunctionalInterface {

  public static void main(String[] args) {

    KRWConverter converter = new KRWConverter();
    converter.convert(2);

    convertUSD(converter,2);
    convertUSD(USD-> System.out.println(USD + "달러 = "  +(USD*1400)+" 원"),2);

    Convertible convertible = USD-> System.out.println(USD + "달러 = "  +(USD*1400)+" 원");
    // 클래스 밖에서 기능정의 -> 함수형 인터페이스
    // 클래스 내에서 기능정의 -> 메소드.
    convertUSD(convertible,2);



    // 전달값이 하나도없다면
    ConvertibleWithNoParams convertible1 =()-> System.out.println("mango");
    convertible1.convert();
    ConvertibleWithNoParams convertible2 =()->{
      System.out.println("mango1");
      System.out.println("mango2");
    };
    convertible2.convert();

    // 두개
    ConvertibleWithTwoParams convertible3 =((str, num) -> {
      System.out.println(str);
      System.out.println(num);
    });
    convertible3.converter("안녕",4);

  }

  public static  void convertUSD(Convertible converter, int USD){
    converter.convert(USD);
  }
}
