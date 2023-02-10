package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;
    Random random = new Random();
    public void Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
