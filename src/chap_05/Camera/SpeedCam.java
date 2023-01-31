package chap_05.Camera;

import chap_05.detector.Detectable;
import chap_05.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private  Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도감지");
    }




    public  void report () {
       reporter.report();
    }

    @Override
    public void detect() {
     detector.detect();
    }
}
