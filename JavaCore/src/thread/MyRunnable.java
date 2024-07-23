package thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Tạm dừng trong 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
