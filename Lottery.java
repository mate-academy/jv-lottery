import java.util.Random;

public class Lottery {
    private static final int LOTTERY_MAX_COUNT = 100;
    public Ball getRandomBall(int index, int value) {
        Ball ball = new Ball();
        index = new Random().nextInt(Color.values().length);
        value = new Random().nextInt(LOTTERY_MAX_COUNT);
        return ball;
    }
}