package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColor = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = randomColor.nextInt(colors.length);
        String colours = colors[randomIndex].toString();
        return colours;
    }
}
