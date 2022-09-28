package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        return new Ball(getRandomColor(), randomNumber.nextInt(100));
    }
}
