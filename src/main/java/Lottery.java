import java.util.Random;
public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color.name(), number);
    }
}
