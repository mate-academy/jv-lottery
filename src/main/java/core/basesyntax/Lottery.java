package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100) + 1; // Generate number between 1 and 100
        return new Ball(randomColor, randomNumber);
    }
}
