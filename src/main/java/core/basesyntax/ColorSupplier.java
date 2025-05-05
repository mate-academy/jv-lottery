package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        String randomColor = colors[random.nextInt(colors.length)].name();
        return randomColor;
    }
}
