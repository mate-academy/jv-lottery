package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndex = new Random();

    public String getRandomColor() {
        return Colors.values()[randomIndex.nextInt(Colors.values().length)]
                 .toString().toLowerCase();
    }
}
