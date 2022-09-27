package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {

        int index = new Random().nextInt(Color.values().length);
        //System.out.println(Colors.values()[index]);

        return Color.values()[index];
    }
}
