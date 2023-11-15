package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    static final int BALLS_TO_CREATE = 3;
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        int maxValueOfRandomDigit = 100;
        ball.setNumber(random.nextInt(maxValueOfRandomDigit));
        return ball;
    }
}

