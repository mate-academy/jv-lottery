package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random; //it is class level?

    {
        random = new Random();
    }

    public Color getRandomColor() {
        int colorLength = Color.values().length;
        int index = random.nextInt(colorLength);
        return Color.values()[index];
    }
}
