package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = ThreadLocalRandom.current()
                .nextInt(Color.values().length);
        return Color.values()[randomIndex].name();
    }
}
