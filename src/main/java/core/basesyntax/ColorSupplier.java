package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final int colorLength = Colors.values().length;
    private final int randomIndex = new SecureRandom().nextInt(colorLength);

    public String getRandomColor() {
        return Colors.values()[randomIndex].name();
    }
}
