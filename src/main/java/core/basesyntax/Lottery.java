package core.basesyntax;
import java.util.Random;
public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball();
        ball.color = colorSupplier.getRandomColor();
        ball.number = random.nextInt(100);
        return  ball;
    }
}
