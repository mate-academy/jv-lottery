package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final int COLOR_LENGTH = Colors.values().length;
    private static final SecureRandom RANDOM = new SecureRandom();

    public String getRandomColor() {
        return Colors.values()[RANDOM.nextInt(COLOR_LENGTH)].name();
    }
}
