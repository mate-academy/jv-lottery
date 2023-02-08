package core.basesyntax.constructors;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom randomizer = new SecureRandom();

    public String getRandomColor() {
        return Colors.values()[randomizer.nextInt(Colors.values().length)].name();
    }
}
