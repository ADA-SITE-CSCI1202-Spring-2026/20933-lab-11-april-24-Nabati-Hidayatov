 class MathTask implements Runnable {
    public void run() {
        long sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i * i;
        }
    }
}
