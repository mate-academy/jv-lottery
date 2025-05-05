package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int num = 100;

    public Ball getRandomBall() {
        Random randon = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = randon.nextInt(num);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
