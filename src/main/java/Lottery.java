import java.util.Random;
public class Lottery {
    private static final Random RANDOM = new Random();
    public static Ball getRandomBall() {
        Colors color = ColorsSupplier.getRandomColor();
        int number = RANDOM.nextInt(100) + 1; // generate a number from 1 to 100
        return new Ball(color.name(), number);
    }
}
