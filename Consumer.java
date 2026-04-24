class Consumer extends Thread {
    SharedResource sr;

    Consumer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int val = sr.get();
            System.out.println("Consumed: " + val);
        }
    }
}
