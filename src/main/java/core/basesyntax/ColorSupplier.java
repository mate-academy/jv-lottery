package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]).toLowerCase();
    }
}
