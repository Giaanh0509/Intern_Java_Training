package thread.implementrunnable;

// Example using Runnable interface
public class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // Code that will run in a new thread
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Runnable-1");
        MyRunnable myRunnable2 = new MyRunnable("Runnable-2");
        MyRunnable myRunnable3 = new MyRunnable("Runnable-3");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
        thread3.start(); // Start the third thread
    }
}
