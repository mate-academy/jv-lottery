package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Випадковий номер від 1 до 100
        return new Ball(randomColor, randomNumber);
    }
}
