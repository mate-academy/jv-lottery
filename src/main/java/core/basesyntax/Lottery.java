package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.setColor(getRandomColor());
        randBall.setNumber(new Random().nextInt(100));
        return randBall;
    }
}
