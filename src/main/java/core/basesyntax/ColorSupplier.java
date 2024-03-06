package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
