import java.util.Random;
public class Lottery {
    private final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = RANDOM.nextInt(100) + 1;
        return new Ball(color.name(), number);
    }
}
