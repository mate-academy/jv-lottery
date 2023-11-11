package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        int randomColor = random.nextInt(colors.length);
        return colors[randomColor].toString();
    }
}
