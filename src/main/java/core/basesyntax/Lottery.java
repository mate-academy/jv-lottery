package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        int ballNumber = random.nextInt(100);
        Ball balls = new Ball();
        balls.setColor(getRandomColor());
        balls.setNumber(ballNumber);
        return balls;
    }
}
