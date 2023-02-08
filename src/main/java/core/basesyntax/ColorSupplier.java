package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(Color.values().length);
    }

    public String getRandomColor() {
        return Color.values()[this.getRandomNumber()].name();
    }
}
