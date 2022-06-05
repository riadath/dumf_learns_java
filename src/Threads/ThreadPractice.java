package Threads;

class CountDown {
    private int i;

    public synchronized void doCountDown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1" -> color = ThreadColor.ANSI_BLUE;
            case "Thread 2" -> color = ThreadColor.ANSI_PURPLE;
            default -> color = ThreadColor.ANSI_GREEN;
        }
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}

class CountDownThread extends Thread {
    private final CountDown threadCountDown;

    CountDownThread(CountDown countDown) {
        threadCountDown = countDown;
    }

    @Override
    public void run() {
        threadCountDown.doCountDown();
    }
}

public class ThreadPractice {

    public static void main(String... args) {
        CountDown cd1 = new CountDown(),cd2 = new CountDown();
        CountDownThread t1 = new CountDownThread(cd1);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(cd1);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
