package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = randomColor.nextInt(colors.length);
        String randomColorName = colors[randomIndex].name();
        return randomColorName;
    }
}
