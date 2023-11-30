package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        String randomColor = new ColorSupplier().getRandomColor();
        randomBall.setColor(randomColor);
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
