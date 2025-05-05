package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int indexOfColor = random.nextInt(Color.values().length);
        Color color = Color.values()[indexOfColor];
        return color.name();
    }
}
