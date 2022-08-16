package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomSupplier = new Random();

    public Colors getRandomColor() {
        int colorBallIndex = randomSupplier.nextInt(Colors.values().length);
        return Colors.values()[colorBallIndex];
    }
}
