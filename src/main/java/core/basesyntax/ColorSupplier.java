package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Ball.Color getRandomColor() {
        Random random = new Random();
        Ball.Color[] colors = Ball.Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
