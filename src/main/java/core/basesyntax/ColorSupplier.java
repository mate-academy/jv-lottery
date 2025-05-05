package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Ball.Color[] COLORS = Ball.Color.values();
    private static final Random RANDOM = new Random();

    public Ball.Color getRandomColor() {
        int index = RANDOM.nextInt(COLORS.length);
        return COLORS[index];
    }
}
