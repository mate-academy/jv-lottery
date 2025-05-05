package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {

        int randomIndex = new Random().nextInt(Colors.values().length);
        String randomColor = Colors.values()[randomIndex].name();
        return randomColor;
    }
}
