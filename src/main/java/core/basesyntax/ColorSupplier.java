package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {

        int index = new Random().nextInt(Colors.values().length);
        System.out.println(Colors.values()[index]);

        return Colors.values()[index];
    }
}
