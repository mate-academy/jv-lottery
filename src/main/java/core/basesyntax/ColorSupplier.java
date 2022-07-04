package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {

        return Colors.Color.values()[random
                .nextInt(Colors.Color.values().length)].name();
    }
}
