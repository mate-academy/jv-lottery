package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        String[] colors = new String[] {"White", "Black", "Silver", "Gold", "Bronze"};
        int count = random.nextInt(colors.length);
        return colors[count];
    }
}
