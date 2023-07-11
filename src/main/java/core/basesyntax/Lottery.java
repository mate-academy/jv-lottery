package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = rand.nextInt(100);

        return new Ball(number, color);
    }

}
