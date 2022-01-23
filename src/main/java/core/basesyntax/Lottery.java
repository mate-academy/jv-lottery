package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int maxNumber = 100;
        String randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(maxNumber);
        return randomColor + " ball number " + randomNumber;
    }
}
