package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public final Random random = new Random();
    public Ball getRandomBall() {
        String color1 = colorSupplier.getRandomColor().toString();
        int number1 = getRandomNumber();
        return new Ball(color1, number1);
    }

    private int getRandomNumber() {
        return random.nextInt(100);
    }
}
