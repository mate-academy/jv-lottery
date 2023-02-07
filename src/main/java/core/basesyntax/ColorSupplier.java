package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final int COLOR_LENGTH = Colors.values().length;
    private final SecureRandom random = new SecureRandom();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(COLOR_LENGTH)].name();
    }
}
