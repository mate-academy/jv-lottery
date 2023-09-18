package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = getRandomColor();
        int randomNumber = getRandomNumber();
        return new Ball(randomColor, randomNumber);
    }

    private int getRandomNumber() {
        return random.nextInt(101);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}
