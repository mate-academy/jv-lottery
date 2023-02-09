package core.basesyntax;

import java.util.Random;
public class ColorSupplier {

    public Random random = new Random();
    public String getRandomColor() {
        random.nextInt(100);
    }
}
