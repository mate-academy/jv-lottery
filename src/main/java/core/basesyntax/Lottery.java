package core.basesyntax;

import java.util.Random;
public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        Ball randomBall = new Ball(ColorSupplier.getRandomColor(), randomNumber);
        return randomBall;
    }
}
