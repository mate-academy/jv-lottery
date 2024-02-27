package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public int getNumberofBall() {
        return new Random().nextInt(100);
    }

    public Ball getRandomBall(String color, int numberofBall) {
        numberofBall = getNumberofBall();
        color = getRandomColor();
        return new Ball(color,numberofBall);
    }
}
