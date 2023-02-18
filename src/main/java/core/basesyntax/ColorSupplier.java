package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int lenghtInt = EnumColor.values().length;
        int randomInt = random.nextInt(lenghtInt);
        EnumColor[] enumColors = EnumColor.values();
        EnumColor randomColor = enumColors[randomInt];
        return randomColor.toString();
    }
}
