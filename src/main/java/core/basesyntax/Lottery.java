package core.basesyntax;
import java.util.Random;

class Lottery {
    Ball ball = new Ball();
    ColorSupplier colorSupplier = new ColorSupplier();
    Ball getRandomBall() {
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}