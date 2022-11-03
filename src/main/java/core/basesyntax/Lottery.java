package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();

    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getrandomball(){
        Ball randomball = new Ball();
        randomball.number = randomNumber.nextInt(100);
        randomball.color = randomColor.getRandomColor();
        return randomball;
    }
}
