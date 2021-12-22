package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random randomizer = new Random();

    public String getRandomColor() {
        return (Colors.values()[randomizer.nextInt(Colors.values().length)]).toString();
    }
}

