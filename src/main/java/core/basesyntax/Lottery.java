package core.basesyntax;

import java.util.Random;

public class Lottery {

    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(100) + 1;
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
