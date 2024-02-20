package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    private Random index = new Random();

    public String getRandomColor() {
        Color randomColor = Color.values()[index.nextInt(Color.values().length)];

        return randomColor.name();
    }
}
