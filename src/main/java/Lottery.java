import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = RANDOM.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
