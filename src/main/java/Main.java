import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier(new Random()));
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
