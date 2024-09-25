package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        Random randomNumberSupplier = new Random();
        int number = randomNumberSupplier.nextInt(101);
        return new Ball(color, number);
    }

}
