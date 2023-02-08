package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(Color.values().length);
    }

    public String getRandomColor() {
        return Color.values()[this.getRandomNumber()].name();
    }
}
