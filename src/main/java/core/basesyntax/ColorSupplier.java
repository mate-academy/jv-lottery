package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        String resultColor = colors[random.nextInt(colors.length)].toString();
        return resultColor;
    }
}
