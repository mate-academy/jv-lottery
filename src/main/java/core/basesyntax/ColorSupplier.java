package core.basesyntax;

import java.util.Random;
enum color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}
    public class ColorSupplier {
       public  color getRandomColor() {
            int index = new Random().nextInt(color.values().length);
            return color.values()[index];
        }
}
