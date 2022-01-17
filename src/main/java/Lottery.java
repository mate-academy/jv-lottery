import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier getColor = new ColorSupplier();
        ball.setColor(getColor.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
