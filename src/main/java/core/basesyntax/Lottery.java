package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = getRandomNumber();
        return new Ball(color, number);
    }
}
