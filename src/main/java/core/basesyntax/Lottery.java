package core.basesyntax;

import java.util.Random;

class Lottery extends Ball {
    Lottery() {
        super();
    }

    Lottery(String color, int number) {
        super(color, number);
    }

    // below method which provides Ball (randomColor, randomIndex);
    Lottery getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random randomInt = new Random();
        int number = randomInt.nextInt(101);
        return new Lottery(color, number);
    }
}
