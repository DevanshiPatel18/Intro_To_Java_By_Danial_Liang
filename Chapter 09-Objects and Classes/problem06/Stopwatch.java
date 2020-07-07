package problem6;

public class Stopwatch {
    private long startTime,endTime;

    long getStartTime(){
        return startTime;
    }

    long getEndTime(){
        return endTime;
    }

    Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){

        return endTime - startTime;
    }
}