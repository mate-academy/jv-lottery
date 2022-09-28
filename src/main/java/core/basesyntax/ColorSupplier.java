package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    Colors[] colors = Colors.values();
    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].name();
    }
}
