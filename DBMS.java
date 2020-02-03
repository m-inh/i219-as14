public class DBMS {
    public static void main(String[] s) throws InterruptedException{
        Student s1 = new Student(1);
        Grade g1 = new Grade(1);

        Transaction t1 = new Transaction(s1, g1);
        Transaction t2 = new Transaction(g1, s1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("OK!");
    }
}
