package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String as = supplier.getRandomColor();
        int index = new Random().nextInt(100);
        return new Ball(as, index);
    }
}
