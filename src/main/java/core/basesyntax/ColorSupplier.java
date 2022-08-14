package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random randomColorSupplier = new Random();

    public Colors getRandomColor() {
        int colorBallIndex = randomColorSupplier.nextInt(Colors.values().length);
        return Colors.values()[colorBallIndex];
    }
}
