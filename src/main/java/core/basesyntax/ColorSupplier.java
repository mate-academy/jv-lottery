package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Ball.Color getRandomColor() {
        Ball.Color[] colors = Ball.Color.values();
        return colors[random.nextInt(colors.length)];
    }
}