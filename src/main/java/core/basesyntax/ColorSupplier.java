package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color someColor = Color.values()[random.nextInt(Color.values().length)];
        return someColor.toString();
    }
}
