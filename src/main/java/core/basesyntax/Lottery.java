package core.basesyntax;

import java.util.Random;

public class Lottery {

    public int getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        System.out.println(color.getRandomColor());
        Random random = new Random();
        int number = random.nextInt(100);
        return number;
    }
}
