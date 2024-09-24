package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {


    public String getRandomColor() {

        int colors = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[colors]);
    }

}
