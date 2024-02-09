package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colour.values().length);
        String randomColor = Colour.values()[index].toString();

        return randomColor;
    }
}
