package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] color = Colors.values();

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return color[index].name();
    }
}
