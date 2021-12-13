package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    public void setRandom(int valur) {

    }

    public String getRandomColor() {
        int value = random.nextInt(Colors.values().length);
        String color = Colors.values()[value].toString();
        return color;
    }
}
