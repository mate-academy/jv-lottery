package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        differentColors[] collors = differentColors.values();
        Random randomCollor = new Random();

        return collors[randomCollor.nextInt(collors.length)].toString();
    }
}
