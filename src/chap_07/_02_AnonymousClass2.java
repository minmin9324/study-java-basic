package chap_07;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
HomeMadeBurger mom=new HomeMadeBurger() {
    @Override
    public void cook() {

    }
}
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();

}