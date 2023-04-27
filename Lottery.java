import java.util.Random;

public class Lottery {
   private static final int LOTTERY_MAX_COUNT = 100;
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = new Random().nextInt(LOTTERY_MAX_COUNT);
        ball.setNumber(number);
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        return ball;
    }
}