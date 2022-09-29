package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Ball ball;

    public Lottery() {
        ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();

        String randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);

        Random random = new Random();
        ball.setNumber(random.nextInt(100));
    }

    public Ball getRandomBall() {
        return ball;
    }
}
