package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random=random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);;
        return Colors.values()[index].name();
    }
}
