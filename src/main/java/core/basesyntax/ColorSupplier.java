package core.basesyntax;

import java.time.DayOfWeek;
import java.util.Random;

public class ColorSupplier {

    public Colors getRandomColor() {
        int index = new Random().nextInt(DayOfWeek.values().length);
        return Colors.values()[index];
    }
}
