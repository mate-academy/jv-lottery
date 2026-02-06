package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] allColors = Color.values();
        return (allColors[random.nextInt(allColors.length)]).name();
    }
}
