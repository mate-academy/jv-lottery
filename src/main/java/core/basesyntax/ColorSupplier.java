package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();
        int colorBallIndex = random.nextInt(Colors.values().length);
        return Colors.values()[colorBallIndex];

    }
}
