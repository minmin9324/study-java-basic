package chap_05;

import chap_05.Camera.FactoryCam;
import chap_05.Camera.SpeedCam;
import chap_05.detector.AccidentDetector;
import chap_05.detector.AdvancedFireDetector;
import chap_05.detector.Detectable;
import chap_05.detector.FireDetector;
import chap_05.reporter.NormalReporter;
import chap_05.reporter.Reportable;
import chap_05.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // interface 안의 변수는 public static final이 생략되어있고
        // class는 public abstract 이 생략되어있음.

        Reportable normalReporter=new NormalReporter();
        Reportable videoReporter=new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        Detectable fireDetector =new FireDetector();
        Detectable advancedFireDetac =new AdvancedFireDetector();
        Detectable accidentDetector =new AccidentDetector();

        fireDetector.detect();
        advancedFireDetac.detect();


        FactoryCam factoryCam=new FactoryCam();

        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();

        SpeedCam speedCam =new SpeedCam();
        speedCam.setDetector(accidentDetector);
        speedCam.setReporter(videoReporter);

        speedCam.detect();
        speedCam.report();

    }
}
