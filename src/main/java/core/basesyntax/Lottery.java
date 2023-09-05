package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public static Ball getRandomball() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Ball randomBall = new Ball();
        randomBall.setBall(ColorSupplier.getRandomColor(), randomNumber);
        return randomBall;
    }
}
