package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(new ColorSupplier().getRandomColor());
        newBall.setNumber(new Random().nextInt(100));
        return newBall;
    }
}
