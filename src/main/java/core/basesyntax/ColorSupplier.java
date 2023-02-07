package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[new SecureRandom().nextInt(Color.values().length)];
    }
}
