package thread.extendthread;

// Example using Thread class
public class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // Code that will run in a new thread
        for (int i = 0; i < 3; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
                System.out.println(threadName + " paused here.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("1st thread");
        MyThread thread2 = new MyThread("2nd thread");
        MyThread thread3 = new MyThread("3rd thread");

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
        thread3.start(); // Start the third thread
    }
}
