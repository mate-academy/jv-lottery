package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomColor;
    Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);// random index for color array
        return randomColor = Colors.values()[index].toString(); //int to String
    }

}
