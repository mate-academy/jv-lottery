package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball newBall = new Ball();

        ColorSupplier newColor = new ColorSupplier();

        newBall.setColor(newColor.getRandomColor());
        newBall.setNumber(new Random().nextInt(100));
        return newBall;
    }
}
