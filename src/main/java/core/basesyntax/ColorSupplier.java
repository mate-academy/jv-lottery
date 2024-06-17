package core.basesyntax;

import java.util.Random;

    public class ColorSupplier{
        int index = new Random().nextInt(Colors.values().length);
        public String getRandomColor() {
        Colors ballColor = Colors.values()[index];
        String color = ballColor.name();
        return color;
    }
}
