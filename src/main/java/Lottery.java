import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        return "We have such a ball: " + colorSupplier.getRandomColor() + " " + randomNumber;
    }
}
