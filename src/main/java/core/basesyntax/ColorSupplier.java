package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int number = random.nextInt(Color.values().length);
        return Color.values()[number].toString();
    }
}
