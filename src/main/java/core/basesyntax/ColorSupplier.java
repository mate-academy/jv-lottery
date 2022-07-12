package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random index = new Random();

    public String getRandomColor() {
        int indLen = index.nextInt(Color.values().length);
        return Color.values()[indLen].name();
    }
}
