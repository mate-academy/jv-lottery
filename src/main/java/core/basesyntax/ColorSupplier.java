package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index]; //Color.values()[index] pobiera stałą enum o wygenerowanym losowo indeksie
        //System.out.println(color);
        return color;
    }
}
