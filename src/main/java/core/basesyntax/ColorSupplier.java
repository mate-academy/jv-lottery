package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random rand = new Random();

    public String getRandomColor() {

        ColorsEnum[] array = ColorsEnum.values();

        int randomcolor = rand.nextInt(array.length);

        return array[randomcolor].name();

    }

}
