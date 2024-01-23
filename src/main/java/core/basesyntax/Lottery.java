package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor().toString();
        int randomNumber = getRandomNumber();
        return new Ball(randomColor, randomNumber);
    }

    private static int getRandomNumber() {
        return new Random().nextInt(101); // включно з 0 до 100
    }
}
