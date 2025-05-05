package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        Ball ball = new Ball();

        Random random = new Random();
        int v = random.nextInt(100);

        ball.setNumber(v);

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        ball.setColour(randomColor);

        return ball;


    }
}
