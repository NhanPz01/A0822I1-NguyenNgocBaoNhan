package ss4_class_and_object.stop_watch;

public class StopWatch {

    private double startTime, endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0.0;
    }

    void setStartTime(double value) {
        this.startTime = value;
    }

    void setEndTime(double value) {
        this.endTime = value;
    }

    double getStartTime() {
        return this.startTime;
    }

    double getEndTime() {
        return this.endTime;
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        this.stop();
        return this.endTime - this.startTime;
    }
}
