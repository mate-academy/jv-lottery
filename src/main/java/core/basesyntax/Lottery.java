package core.basesyntax;
import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        Random random = new Random();
        int num = random.nextInt(100);

        ball.color = colorSupplier.getRandomColor();
        ball.number = num;
        return ball;
    }
}
