package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rundom = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = rundom.nextInt(100);
        return new Ball(color, number);
    }
}
