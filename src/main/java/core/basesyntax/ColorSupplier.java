package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        enum ColorBase{
            BLUE,
            YELLOW,
            GREEN,
            RED;
        }

        Random random = new Random();
        int randomNum = random.nextInt(ColorBase.values().length);
        ColorBase[] randomColor = ColorBase.values();

        return randomColor[randomNum].toString();
    }
}
