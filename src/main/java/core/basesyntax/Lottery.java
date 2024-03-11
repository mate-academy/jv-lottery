package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        return new Ball(randomColor, randomNumber);
    }
}

