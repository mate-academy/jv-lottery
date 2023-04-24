import java.util.Random;

public class Lottery {
    public Ball getRandomBall(int index, int value) {
        Ball ball = new Ball();
        index = new Random().nextInt(Color.values().length);
        value = new Random().nextInt(100);
        return ball;
    }
}