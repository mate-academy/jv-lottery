package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int enumLength = Color.values().length;

    public String getRandomColor() {
        int index = random.nextInt(enumLength);
        return String.valueOf(Color.values()[index]);
    }
}
