package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setNumber(new Random().nextInt(100));
        newBall.setColor(new ColorSupplier().getRandomColor());
        return newBall;
    }
}
