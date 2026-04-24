public class WaitNotifyMain {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
        new Producer(sr).start();
        new Consumer(sr).start();
    }
}
