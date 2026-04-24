class SharedResource {
    private int value;
    private boolean bChanged = false;

    public synchronized int get() {
        while (!bChanged) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bChanged = false;
        return value;
    }

    public synchronized void set(int v) {
        value = v;
        bChanged = true;
        notify();
    }
}
