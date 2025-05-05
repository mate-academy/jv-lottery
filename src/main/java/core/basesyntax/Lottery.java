package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random rn = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        final int num = 100;
        int number = rn.nextInt(num);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
