package core.basesyntax;

import java.util.Random;

public class Loterry {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {
        return random.nextInt(100) + " " + colorSupplier.getRandomColor();
    }
}
