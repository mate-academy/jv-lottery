package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int number = new Random().nextInt(100);
        Ball testBall = new Ball(supplier.getRandomColor(), number);
        return testBall.toString();
    }
}
