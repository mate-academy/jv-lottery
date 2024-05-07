package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSuplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase(Locale.ROOT);
    }
}
