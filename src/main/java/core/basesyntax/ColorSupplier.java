package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random;
    private Color color;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        color = Color.values()[index];
        return color.toString();
    }
}
