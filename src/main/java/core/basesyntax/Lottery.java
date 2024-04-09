package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(101);
        Ball newBall = new Ball();
        newBall.setColor(color);
        newBall.setNumber(number);
        return newBall;
    }
}
