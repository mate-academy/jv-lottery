package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Object getRandomBall() {
        Ball ball = new Ball(getRandomColor(), new Random().nextInt(100));
        return ball;
    }
}
