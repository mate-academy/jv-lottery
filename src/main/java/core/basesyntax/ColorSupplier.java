package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public String getRandomColor() {
        return Color.values()[randomColor.nextInt(Color.values().length)].toString();
    }
}
