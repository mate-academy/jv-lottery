package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random colorGen = new Random();
        String rCol = Ball.color.values()[colorGen.nextInt(Ball.color.values().length)].toString();
        return rCol;
    }
}
