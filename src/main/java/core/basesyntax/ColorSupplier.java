package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final int randomNumber = new SecureRandom().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[randomNumber];
    }
}
