package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("The ball number " + i
                    + ":\n" + "The color is " + new ColorSupplier().getRandomColor()
                    + "\n" + "The number is " + (new Random().nextInt(100)) + "\n");
        }
    }
}
