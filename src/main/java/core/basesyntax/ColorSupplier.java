package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random =new Random();
    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        String result = Color.values()[index].toString();
        return result;
    }
}
