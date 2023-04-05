package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rundom = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = rundom.nextInt(COUNT);
        return new Ball(color, number);
    }
}
