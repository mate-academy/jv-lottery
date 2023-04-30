import java.util.Random;

public class Lottery {
   private static final int LOTTERY_MAX_COUNT = 100;
   private final ColorSupplier colorSupplier = new ColorSupplier();
   private final Random random = new Random();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(LOTTERY_MAX_COUNT);
        ball.setNumber(number);
        ball.setColor(colorSupplier.getRandomColor().name());
        return ball;
    }
}