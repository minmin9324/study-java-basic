package chap_05.detector;

public class FireDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("화재를 감지합니다.");
    }
}
