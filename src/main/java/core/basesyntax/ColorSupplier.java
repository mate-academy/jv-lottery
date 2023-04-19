package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}