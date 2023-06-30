package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int colorsAmount = Color.values().length;
        int randomIndex = random.nextInt(colorsAmount);
        Color randomColor = Color.values()[randomIndex];
        return randomColor;
    }
}
