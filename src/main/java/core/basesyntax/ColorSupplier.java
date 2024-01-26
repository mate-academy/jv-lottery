package core.basesyntax;

import java.util.Random;
import mypackage.Color;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        int indexColor = random.nextInt(Color.values().length);
        Color color = Color.values()[indexColor];
        return color.name();
    }
}
