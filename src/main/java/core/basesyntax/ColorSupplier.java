package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomColor;

    public ColorSupplier() {
        int pick = new Random().nextInt(Color.values().length);
        this.randomColor = Color.values()[pick].name();
    }

    public String getRandomColor() {
        return randomColor;
    }
}
