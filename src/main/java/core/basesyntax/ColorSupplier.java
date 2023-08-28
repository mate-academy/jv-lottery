package core.basesyntax;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

 class ColorSupplier {
    private Random random = new Random();

     String getRandomColor() {
        int indexOfColor = random.nextInt(Colors.values().length);
        return Colors.values()[indexOfColor].toString();
    }
}
