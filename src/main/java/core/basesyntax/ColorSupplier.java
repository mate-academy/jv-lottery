package core.basesyntax;

import ball.characteristics.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
