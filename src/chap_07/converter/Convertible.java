package chap_07.converter;


@FunctionalInterface  // 이걸 정의하면 함수형 인터페이스를 쓴다는 의미 -> 추상메소드가 1개여야 메칭이 가능한데 2개이면 안되기에
// 이 걸 사용하면 1개 이상의 추상메소드를 정의했을때 오류를 냄으로 방지할 수 있다.
public interface Convertible {
  void convert(int USD);
//void  convert2(int USD);
}
