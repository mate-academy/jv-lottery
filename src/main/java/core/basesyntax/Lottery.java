package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        final Colors randomColor = ColorSupplier.getRandomColor();
        final Random randomNumber = new Random();
        int randomBall = randomNumber.nextInt(101);
        return new Ball(randomColor, randomBall);
    }
}
