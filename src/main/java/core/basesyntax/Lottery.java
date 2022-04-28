package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        int randomNumber = new Random().nextInt(100);
        Ball randomBall = new Ball(randomNumber, randomColor.getRandomColor());
        return randomBall;
    }
}
