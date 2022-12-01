package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rnd = new Random();
        Colors[] colors = Colors.values();
        return (colors[rnd.nextInt(Colors.values().length)].toString());
    }
}
