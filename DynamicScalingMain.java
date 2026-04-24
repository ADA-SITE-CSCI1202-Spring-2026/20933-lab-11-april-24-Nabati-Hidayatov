public class Main {
    public static void main(String[] args) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        long start1 = System.currentTimeMillis();
        Thread t = new Thread(new MathTask());
        t.start();
        t.join();
        long end1 = System.currentTimeMillis();
        Thread[] threads = new Thread[cores];
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < cores; i++) {
            threads[i] = new Thread(new MathTask());
            threads[i].start();
        }
        for (int i = 0; i < cores; i++) {
            threads[i].join();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("1 Thread Time: " + (end1 - start1));
        System.out.println("Max Threads Time: " + (end2 - start2));
    }
}
