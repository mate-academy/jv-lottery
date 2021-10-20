package core.basesyntax;

import core.basesyntax.models.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }
}
