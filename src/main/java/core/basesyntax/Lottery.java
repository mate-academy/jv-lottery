package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return random.nextInt(100) + " " + supplier.getRandomColor();
    }
}
