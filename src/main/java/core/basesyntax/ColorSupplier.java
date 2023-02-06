package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final int RANDOM_NUMBER = new SecureRandom().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[RANDOM_NUMBER].toString();
    }
}
