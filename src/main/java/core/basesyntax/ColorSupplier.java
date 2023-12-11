package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int i = random.nextInt(4);
        return colors[i].toString();
    }
}
