package core.basesyntax;

import java.util.Random;
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}
public class ColorSupplier {
    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
