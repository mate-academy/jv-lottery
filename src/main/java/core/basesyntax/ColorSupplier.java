package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randNumbersColors = random.nextInt(Color.values().length);
        Color differentColors = Color.values()[randNumbersColors];
        return differentColors.toString();
    }
}
