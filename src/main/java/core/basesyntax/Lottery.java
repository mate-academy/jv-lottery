package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.setColor(ball.getRandomColor());
        ball.setNumber(new Random().nextInt(100));

        return ball;
    }
}
