package org.example.util;

public class Timer {
    private long startTimer;
    private long endTimer;

    public void start(){
        startTimer = System.currentTimeMillis();
    }
    public void stop(){
        endTimer = System.currentTimeMillis();
    }
    public long elapsedTime(){
        return (endTimer - startTimer);
    }
    public static void main(String[] args) {
        Timer t = new Timer();
        t.start();
        // Perform some tasks or wait for a while
        t.stop();
        long elapsed = t.elapsedTime();
        System.out.println("Elapsed Time: " + elapsed + " milliseconds");
    }
}
