import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int index = new Random().nextInt(Colors.values().length);
        int value = new Random().nextInt(100);
        return ball;
    }
}