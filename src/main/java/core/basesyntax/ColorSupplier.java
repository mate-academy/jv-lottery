package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return String.valueOf(colors[index]);
    }

}
