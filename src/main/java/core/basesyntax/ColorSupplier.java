package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        Color[] allColors = Color.values();
        return (allColors[random.nextInt(allColors.length)]).name();
    }
}
