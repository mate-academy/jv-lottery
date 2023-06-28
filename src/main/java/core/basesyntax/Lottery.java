package core.basesyntax;

import java.util.Random;

public class Lottery {
    public  Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.color = ColorSupplier.getRandomColor();
        randomBall.number = new Random().nextInt(100);
        return randomBall;
    }
}
