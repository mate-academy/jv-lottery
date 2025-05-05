package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColor = new Random();
        String myColor = Colors.values()[randomColor.nextInt(Colors.values().length)].toString();
        return myColor;
    }
}
