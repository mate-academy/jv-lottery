package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
