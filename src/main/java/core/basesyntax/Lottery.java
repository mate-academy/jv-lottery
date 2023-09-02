package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random randomNumber = new Random();

    public static Random getRandomNumber() {
        return randomNumber;
    }

    public static void setRandomNumber(Random randomNumber) {
        Lottery.randomNumber = randomNumber;
    }

    public static Ball getRandomBall() {
        Ball rundomBall;
        rundomBall = new Ball(ColorSupplier.getRandomColor(), randomNumber.nextInt(100));
        return rundomBall;
    }
}
