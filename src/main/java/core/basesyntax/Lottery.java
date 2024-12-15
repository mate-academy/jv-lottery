package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball returnBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.color = colorSupplier.getRandomColor();
        Random random = new Random();
        randomBall.number = random.nextInt(100);
        return randomBall;
    }
}
