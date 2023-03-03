package chap_07;

public class _02_AnonymousClass2 {

  public static void main(String[] args) {
    HomeMadeBurger mom =getMomMadeBurger();
    mom.cook();
    System.out.println("----------");
    HomeMadeBurger bro =getBroMadeBurger();
    bro.cook();
    System.out.println("----------");
  }

  private static HomeMadeBurger getBroMadeBurger() {
    return new HomeMadeBurger() {
      @Override
      public void cook() {
        System.out.println("집에서 만드는 동생표 군대리아");

      }
    };
  }


  public static HomeMadeBurger getMomMadeBurger() {

    return new HomeMadeBurger() {
      @Override
      public void cook() {
        System.out.println("집에서 만드는 엄마표 수제버거");

      }
    };
  }

}

abstract class HomeMadeBurger {   // 구현할때마다 다른 기능이 필요할때

  public abstract void cook();

}