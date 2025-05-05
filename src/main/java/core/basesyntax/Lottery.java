package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random value = new Random();
        int num = value.nextInt(LIMIT);
        return new Ball(color.getRandomColor().toString(), num);
    }
}
