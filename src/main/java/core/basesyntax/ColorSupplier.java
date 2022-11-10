package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Lottery {
    Random random = new Random();
    int randomIndex = random.nextInt(Color.values().length);
    public String getRandomColor() {

        return String.valueOf(Color.values()[randomIndex]);
    }
}
