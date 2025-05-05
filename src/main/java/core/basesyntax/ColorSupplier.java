package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[getRandomNumber()].name();
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(Color.values().length);
    }
}
