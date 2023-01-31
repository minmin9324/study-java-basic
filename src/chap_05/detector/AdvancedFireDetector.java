package chap_05.detector;

public class AdvancedFireDetector implements  Detectable{
    @Override
    public void detect() {
        System.out.println("개선된 버젼으로 화재를 감지합니다.");
    }
}
