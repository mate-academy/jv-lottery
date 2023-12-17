package core.basesyntax;

import core.basesyntax.ball.Ball;
import core.basesyntax.ball.Color;
import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int indexColor = new Random().nextInt(Color.values().length);
        Ball randomBall = new Ball();
        randomBall.setColor(Color.values()[indexColor].toString());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall.toString();
    }

}
