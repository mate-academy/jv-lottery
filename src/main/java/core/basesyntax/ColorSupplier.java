package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom randomizer = new SecureRandom();

    public Colors getRandomColor() {
        return Colors.values()[randomizer.nextInt(Colors.values().length)];
    }
}
