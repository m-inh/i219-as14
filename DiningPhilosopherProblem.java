public class DiningPhilosopherProblem {
    public void begin(int n, int m) {
        Chopstick left;
        Chopstick right = new Chopstick();
        Chopstick tmp = right;
        for (int i = 0; i < n - 1; i++) {
            left = right;
            right = new Chopstick();
            (new Philosopher(m, left, right)).start();
        }
        left = right;
        right = tmp;
        (new Philosopher(m, right, left)).start();
    }
}