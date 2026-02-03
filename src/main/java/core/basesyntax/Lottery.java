package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball randomBall = new Ball();
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(101);

        randomBall.setNumber(randomNumber);
        randomBall.setColor(new ColorSupplier().getRandomColor());

        return randomBall;
    }
}
