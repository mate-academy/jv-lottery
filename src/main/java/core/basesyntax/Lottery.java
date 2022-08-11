package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier coloursSupplier = new ColorSupplier();
        Colors randomColor = coloursSupplier.getRandomColor();
        randomBall.setColor(randomColor.toString());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
