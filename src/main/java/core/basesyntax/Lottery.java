package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random randomsNumber = new Random();
        int numberOfRandBall = randomsNumber.nextInt(100);
        ColorSupplier randomsColor = new ColorSupplier();
        String colorOfRandomBall = randomsColor.getRandomColor();
        Ball randomsBall = new Ball(colorOfRandomBall, numberOfRandBall);
        return String.valueOf(randomsBall);
    }
}
