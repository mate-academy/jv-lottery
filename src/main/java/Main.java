import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        Lottery lottery = new Lottery(random, new ColorSupplier(random));
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
