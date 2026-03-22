package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();

    public Colors[] getColors() {
        return colors;
    }

    public String getRandomColor() {
        int index = new Random().nextInt(colors.length);
        return colors[index].name();
    }
}
