package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random randomNumber = new Random();
        int numberForRandBall = randomNumber.nextInt(100);
        ColorSupplier randomColor = new ColorSupplier();
        String colorForRandBall = randomColor.getRandomColor();
        Ball randomBall = new Ball(colorForRandBall, numberForRandBall);
        return String.valueOf(randomBall);
    }
}
