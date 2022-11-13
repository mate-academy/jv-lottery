package core.basesyntax;
import java.util.Random;

class Lottery {
    Ball ball = new Ball();
    ColorSupplier colorSupplier = new ColorSupplier();
    Ball getRandomBall() {
        Random random = new Random();
        ball.number = random.nextInt(100);
        ball.color = colorSupplier.getRandomColor();
        return ball;
    }
}