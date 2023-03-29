package core.basesyntax;

import java.util.Random;

public class Ball {
    String color;
    int number;

    public int getRandomNumber() {
        int ballNumber = new Random().nextInt(100);
        return ballNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
