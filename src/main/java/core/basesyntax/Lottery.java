package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(getRandomColor());
        newBall.setNumber(new Random().nextInt(101));
        return newBall;
    }
}
