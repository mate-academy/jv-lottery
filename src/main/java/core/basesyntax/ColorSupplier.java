package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        String colorName = Color.values()[index].name();
        return colorName;
    }
}
