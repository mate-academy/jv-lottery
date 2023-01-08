package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColor = new Random();
        int index = randomColor.nextInt(Colors.values().length);
        Colors[] values = Colors.values();
        return values[index].toString();
    }
}
