package core.basesyntax;

import java.util.Random;
public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)].toString();
    }
}
