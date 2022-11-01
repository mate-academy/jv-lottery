package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

String randomColor;
    public  String getRandomColor() {
        Color[] colors = Color.values();
        for (int i = 0; i < colors.length; i++) {
            Random random = new Random();
            randomColor =  colors[random.nextInt(colors.length)].toString();
        }
       return  randomColor;
    }
}
