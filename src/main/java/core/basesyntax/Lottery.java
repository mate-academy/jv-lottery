package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randomNumber = new Random();

    public Ball getBall() {
        int num = randomNumber.nextInt(100);
        String color = new ColorSupplier().getRandomColor();

        return new Ball(color,num);
    }
}
