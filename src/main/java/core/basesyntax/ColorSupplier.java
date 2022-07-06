package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return ColorBall.values()[random.nextInt(ColorBall.values().length)].name();
    }
}
