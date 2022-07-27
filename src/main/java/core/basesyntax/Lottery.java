package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public String getRandomBall() {
        Random randomNumber = new Random();
        int i = randomNumber.nextInt(100);
        return "This ball have number: " + i + " and have color: " + getRandomColor();
    }
}
