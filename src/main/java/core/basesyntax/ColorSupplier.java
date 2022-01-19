package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random randomColor = new Random();
        String myColor = colors[randomColor.nextInt(6)].toString();
        return myColor;
    }
}
