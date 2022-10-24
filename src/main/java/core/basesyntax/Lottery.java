package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColour(new ColorSupplier().getRandomColor().toString());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }

}
