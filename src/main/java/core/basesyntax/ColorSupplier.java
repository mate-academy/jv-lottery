package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Lottery {

    public String getRandomColor() {

        Random random = new Random();

        int randomIndex = random.nextInt(Color.values().length);

        return String.valueOf(Color.values()[randomIndex]);
    }
}
