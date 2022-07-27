package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random=new Random();
        int index=0;
        index=random.nextInt(DifferentColors.values().length);
        return DifferentColors.values()[index].toString();
    }
}
