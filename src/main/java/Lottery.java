import java.util.Random;
public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color.name(), number);
    }
}
