package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);// random index for color array
        return Colors.values()[index].toString(); //int to String

    }

}
