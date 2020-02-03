import java.util.*;

public class Philosopher extends Thread {
    private static int nextId = 0;
    private final int myId;
    private final int howManyDinners;
    private Chopstick left;
    private Chopstick right;

    public Philosopher(int n, Chopstick l, Chopstick r) {
        this.myId = nextId++;
        this.howManyDinners = n;
        this.left = l;
        this.right = r;
    }

    public void run() {
        for (int i = 0; i < howManyDinners; i++) {
            try {
                left.acquire();
            } catch (InterruptedException e) {
            }
            try {
                right.acquire();
            } catch (InterruptedException e) {
            }
            right.release();
            left.release();
        }
    }
}