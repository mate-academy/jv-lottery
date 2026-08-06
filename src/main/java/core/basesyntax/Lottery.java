package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();

        Random randomNumber = new Random();
        int lowerBound = 1;
        int upperBound = 101;

        int randomInt = randomNumber.nextInt(upperBound - lowerBound) + lowerBound;

        Ball randomBall = new Ball();

        randomBall.setColor(color);
        randomBall.setNumber(randomInt);

        return randomBall;
    }
}
