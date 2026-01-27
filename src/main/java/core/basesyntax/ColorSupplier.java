package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Ball.Color[] colors = Ball.Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}
