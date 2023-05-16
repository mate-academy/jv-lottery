package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random RANDOM_NUMBER = new Random();
    private  final ColorSupplier COLOR_OF_BALL = new ColorSupplier();

        public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(RANDOM_NUMBER.nextInt(100));
        ball.setColor(COLOR_OF_BALL.getRandomColor());
        return ball;
    }

}
