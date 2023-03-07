package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    
    public String getRandomColor() {
        int randomBallNumber = new Random().nextInt(Color.values().length);
        return Color.values()[randomBallNumber].toString();
    }
}