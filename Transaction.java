public class Transaction extends Thread {
    private Table o1;
    private Table o2;

    public Transaction(Table o1, Table o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (this.o1) {
            synchronized (this.o2) {
                this.o2.update();
                this.o1.update();
            }
        }
    }
}
