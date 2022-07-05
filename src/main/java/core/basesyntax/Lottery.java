package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        return new Ball(getRandomColor(), randomNumber);
    }
}
