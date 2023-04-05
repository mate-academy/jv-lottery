package core.basesyntax;

import  java.util.Random;

public class ColorSupplier {
    enum Colors {

        RED,
        BLUE,
        GREEN,
        WHITE,
        BLACK,
        YELLOW,
        MAGENTA,
        CYAN
    }
    public String getRandomColor() {
        Colors [] color = Colors.values();
        Random random = new Random();
        int numbercolor = random.nextInt(color.length);
        return color[numbercolor].toString();
    }
}
