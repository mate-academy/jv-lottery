package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex].name();
    }
}
