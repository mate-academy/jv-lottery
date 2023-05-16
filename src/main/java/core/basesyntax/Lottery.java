package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random BALL_RANDOM_NUMBER = new Random();
    private  final ColorSupplier BALL_RANDOM_COLOR = new ColorSupplier();

        public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(BALL_RANDOM_NUMBER.nextInt(100));
        ball.setColor(BALL_RANDOM_COLOR.getRandomColor());
        return ball;
    }

}
