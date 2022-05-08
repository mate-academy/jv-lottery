package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Color.values().length - 1);
        return Color.values()[i].name();
    }
}
