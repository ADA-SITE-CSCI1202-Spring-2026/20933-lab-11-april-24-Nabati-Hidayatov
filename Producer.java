class Producer extends Thread {
    SharedResource sr;

    Producer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sr.set(i);
            System.out.println("Produced: " + i);
        }
    }
}
