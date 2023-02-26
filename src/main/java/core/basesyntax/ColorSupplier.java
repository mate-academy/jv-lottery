package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public  String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        String result = Colors.values()[index].toString();
        return result;
    }
}
