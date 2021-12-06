package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        return (Colors.values()[(new Random()).nextInt(Colors.values().length)]).toString();
    }
}

enum Colors {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    BLACK,
    WHITE
}