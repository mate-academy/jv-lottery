package core.basesyntax;

import java.util.Random;

public class Lottery {

    ColorSupplier colorSupplier = new ColorSupplier();

    Random random = new Random();

    private static int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
