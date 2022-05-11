package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    //private final Random random = new Random();
    public Color getRandomColor() {
        return null;
        //int indexColor = random.nextInt(Color.values().length);
        int indexColor = new Random().nextInt(Color.values().length);
       // return String.valueOf(Color.values()[indexColor]);
        return Color.values()[indexColor];
    }
}
