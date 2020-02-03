public class Chopstick {
    private boolean beingUsed;

    public Chopstick() {
        this.beingUsed = false;
    }

    public synchronized void acquire() throws InterruptedException {
        while (beingUsed) {
            this.wait();
        }
        beingUsed = true;
    }

    public synchronized void release() {
        beingUsed = false;
        this.notifyAll();
    }
}