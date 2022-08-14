package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int random = new Random().nextInt(Colors.values().length);
        System.out.println(Colors.values()[random].toString());
        return Colors.values()[random].toString();
    }
}
