package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {

        int randomNum = random.nextInt(ColorBase.values().length);
        ColorBase[] randomColor = ColorBase.values();

        return randomColor[randomNum].name();
    }
}
