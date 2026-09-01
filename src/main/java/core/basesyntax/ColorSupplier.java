package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    //Random random = new Random();
    public String getRandomColor() {

        int index = new Random().nextInt(Colors.values().length);
        StringBuilder returnColor = new StringBuilder();
        returnColor.append(Colors.values()[index]);
        return returnColor.toString();
    }
}
