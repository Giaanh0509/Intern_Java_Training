package thread.synchronizethread;

class NoSyncCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class NoSynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        NoSyncCounter counter = new NoSyncCounter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count (without synchronization): " + counter.getCount());
    }
}

