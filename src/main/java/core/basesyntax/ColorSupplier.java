package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomValue = new Random();
    private int positionOfColor;

    public String getRandomColor() {
        positionOfColor = randomValue.nextInt(Color.values().length);
        return Color.values()[positionOfColor].name();
    }
}
