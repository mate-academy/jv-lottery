package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        return (Colours.values()[new Random().nextInt(Colours.values().length)]).name();
    }
}
