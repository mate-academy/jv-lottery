package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        DifferentColors[] collors = DifferentColors.values();
        Random randomCollor = new Random();
        return collors[randomCollor.nextInt(collors.length)].toString();
    }
}
