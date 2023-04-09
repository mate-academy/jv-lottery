package core.basesyntax;

import java.util.Random;
import java.lang.String;
public class ColorSupplier {
    private final Random randomColor = new Random();
    public String getRandomColor() {
        return Color.values()[randomColor.nextInt(Color.values().length)].name();
    }
}