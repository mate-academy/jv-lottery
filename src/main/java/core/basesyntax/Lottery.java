package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        Ball ball = new Ball();

        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor().name());

        Random random = new Random();
        final int MAXIMUM_NUMBER_LIMIT = 100;
        ball.setNumber(random.nextInt(MAXIMUM_NUMBER_LIMIT));
        return ball;
        }

}
