package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
