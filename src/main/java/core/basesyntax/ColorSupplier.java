package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int bound = Colour.values().length;
        int index = random.nextInt(bound);
        return Colour.values()[index].name();
    }
}
