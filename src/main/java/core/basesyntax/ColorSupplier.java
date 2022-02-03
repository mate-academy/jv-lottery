package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public String getRandomColor() {
        int random = rand.nextInt(Colors.values().length);
        return Colors.values()[random].toString();
    }
}
