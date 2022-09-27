package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int index = new Random().nextInt(Color.values().length);
        Ball ball = new Ball();
        ball.setColor(String.valueOf(Color.values()[index]));
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
