package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random generateRandomColor = new Random();

    public String getRandomColor() {
        int index = generateRandomColor.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
