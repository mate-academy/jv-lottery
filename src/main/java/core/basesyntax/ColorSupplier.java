package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        random = new Random();
        int index = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
