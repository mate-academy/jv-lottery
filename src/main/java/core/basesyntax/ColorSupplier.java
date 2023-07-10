package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int length = colors.length;
        int index = random.nextInt(length);
        return colors[index].name();
    }
}
