package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public int random(int number) {
        return new Random().nextInt(number);
    }
    public String getRandomColor() {
        int rand = random(Colors.values().length);

        return Colors.values()[rand].name();
    }
}
