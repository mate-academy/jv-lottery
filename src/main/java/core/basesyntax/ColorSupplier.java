package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final SecureRandom RANDOM = new SecureRandom();

    public String getRandomColor() {
        return Color.values()[RANDOM.nextInt(Color.values().length)].name();
    }
}
