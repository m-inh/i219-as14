import java.util.Random;

public class Grade extends Table {
    private int id;
    private int version;

    public Grade(int id) {
        this.id = id;
    }

    public void update() {
        Random random = new Random();
        this.version = random.nextInt();
    }
}
