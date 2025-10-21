package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomNumber = random.nextInt(Colors.values().length);
        Colors value = Colors.values()[randomNumber];
        return value.toString();
    }
}
