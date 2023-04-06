import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private static final int CONSTANT_CASE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(CONSTANT_CASE) + 1;
        return new Ball(color.name(), number);
    }
}
