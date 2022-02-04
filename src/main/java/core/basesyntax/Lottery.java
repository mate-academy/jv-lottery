package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball randomBall = new Ball(colorSupplier.getRandomColor(), getRandomNumber());

    public Ball getRandomBall() {
        return randomBall;
    }

    private int getRandomNumber() {
        Random indexNumber = new Random();
        int numberBall = indexNumber.nextInt(100);
        return numberBall;
    }
}
