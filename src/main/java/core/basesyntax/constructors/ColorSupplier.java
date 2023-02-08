package core.basesyntax.constructors;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom randomizer = new SecureRandom();

    public String getRandomColor() {
        return Color.values()[randomizer.nextInt(Color.values().length)].name();
    }
}
