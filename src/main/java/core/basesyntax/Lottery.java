package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball randomBall = new Ball(colorSupplier.getRandomColor(), getRandomNumber());
        return randomBall;
    }

    private int getRandomNumber() {
        Random indexNumber = new Random();
        int numberBall = indexNumber.nextInt(100);
        return numberBall;
    }
}
