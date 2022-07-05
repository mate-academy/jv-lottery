package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(Colors.values().length);
        return colors[number].toString();
    }
}
