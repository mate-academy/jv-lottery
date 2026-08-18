package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] values = Colors.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        Colors randomColor = values[randomIndex];
        return randomColor.name();
    }
}
