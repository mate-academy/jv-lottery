package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        ball.setColor(color);
        Random random = new Random();
        /*const MAX_BOUND = 101;
        ball.setNumber(random.nextInt(MAX_BOUND));

        Cannot resolve symbol 'constant'
        */
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
