package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(101);
        Ball randomBall = new Ball(getRandomColor(), randomNumber);
        return randomBall;
    }
}
