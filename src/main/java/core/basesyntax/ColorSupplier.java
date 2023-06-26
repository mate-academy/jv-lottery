package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int indexRandom = random.nextInt(Colors.values().length);
        Colors colors = Colors.values()[indexRandom];
        return String.valueOf(colors);
    }
}
