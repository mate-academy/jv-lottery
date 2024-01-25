package mypackage;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        String randomColor = supplier.getRandomColor();

        Ball randomBall = new Ball();
        randomBall.setColor(randomColor);
        randomBall.setNumber(randomNumber);
        return randomBall;
    }
}
