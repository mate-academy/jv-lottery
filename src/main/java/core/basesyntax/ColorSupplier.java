package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Colors[] val = Colors.values();
        Colors randomColor;
        int rnd;
        Random random = new Random();
        rnd = random.nextInt(val.length);
        randomColor = val[rnd];

        return randomColor.toString();
    }

}

