package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randC = new Random();
    public String getRandomColor() {
        Integer randomNumber = randC.nextInt(101);
        String rN = randomNumber.toString();
        return rN;
    }
}

