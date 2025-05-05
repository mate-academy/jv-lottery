package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private static final SecureRandom COLOR = new SecureRandom();

    public Color getRandomColor() {
        return Color.values()[COLOR.nextInt(Color.values().length)];
    }
}
