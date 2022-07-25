package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    public String getRandomColor() {
        String color;
        Random random = new Random();
        int ranValue = random.nextInt(4);
        Colors[] allColors = Colors.values();
        color = allColors[ranValue].toString();
        return color;
    }
}
