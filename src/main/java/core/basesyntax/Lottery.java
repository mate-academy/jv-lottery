package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getBall() {
        int num = random.nextInt(100);
        String color = new ColorSupplier().getRandomColor();

        return new Ball(color,num);
    }
}
