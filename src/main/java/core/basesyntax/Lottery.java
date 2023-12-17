package core.basesyntax;

import core.basesyntax.ball.Ball;
import core.basesyntax.ball.Color;

import java.util.Random;

public class Lottery {


    public String getRandomBall() {
        Ball randomBall = new Ball();
        int indexColor = new Random().nextInt(Color.values().length);
        randomBall.setColor(Color.values()[indexColor].toString());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall.toString();
    }

}
