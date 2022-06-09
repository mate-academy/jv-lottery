package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int resultRandomNumber = randomNumber.nextInt(100);
        return new Ball(getRandomColor(),resultRandomNumber);
    }
}
