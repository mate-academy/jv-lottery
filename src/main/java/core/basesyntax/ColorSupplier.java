package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] array = Color.values();
        int choice = random.nextInt(0,array.length);
        return array[choice];
    }
}
