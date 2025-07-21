package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = rand.nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
