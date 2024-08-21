package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int indexOfColor = new Random().nextInt(Color.values().length);
        Color color = Color.values()[indexOfColor];
        return color.toString();
    }
}
