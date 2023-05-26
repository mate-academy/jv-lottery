package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].name();
    }
}
