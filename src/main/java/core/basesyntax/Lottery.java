package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        Ball ball = new Ball();

        Random random = new Random();
        int nextInt = random.nextInt(100);

        ball.setNumber(nextInt);

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        ball.setColour(randomColor);

        return ball;

    }
}
