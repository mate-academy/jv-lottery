package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int randomNumber = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[randomNumber]);
    }
}


