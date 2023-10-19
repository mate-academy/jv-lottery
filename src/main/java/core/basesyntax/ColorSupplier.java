package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random generateRandomNumber = new Random();

    public String getRandomColor() {
        int randomColorIndex = generateRandomNumber.nextInt(Color.values().length);
        return "" + Color.values()[randomColorIndex];
    }
}
