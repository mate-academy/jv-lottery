package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final int AMOUNT_OF_COLORS = 11;
    Random random = new Random();
    
    public String getRandomColor() {
        int index = random.nextInt(AMOUNT_OF_COLORS);
        Color color = Color.values()[index];
        return color.name();
    }
}
