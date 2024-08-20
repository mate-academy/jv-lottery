package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rnd = new Random();

    public Color getRandomColor() {
        int index = rnd.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color;
    }
}
