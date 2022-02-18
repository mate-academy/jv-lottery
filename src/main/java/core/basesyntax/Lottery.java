package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        return new Ball(getRandomColor(), randomNumber);
    }
}
