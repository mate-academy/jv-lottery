import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxNumber = 100;

    public String getRandomBall() {
        int randomNumber = random.nextInt(maxNumber);
        return "We have such a ball: " + colorSupplier.getRandomColor() + " " + randomNumber;
    }
}
