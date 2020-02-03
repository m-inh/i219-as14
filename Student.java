import java.util.Random;

public class Student extends Table {
    private int id;
    private int version;

    public Student(int id) {
        this.id = id;
    }

    public void update() {
        Random random = new Random();
        this.version = random.nextInt();
    }
}