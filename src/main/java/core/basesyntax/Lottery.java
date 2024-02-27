package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private final int numberofBall = new Random().nextInt(100);

    public int getNumberofBall() {
        return numberofBall;
    }

    public Balls getRandomBall(String color, int numberofBall) {
        numberofBall = getNumberofBall();
        color = getRandomColor();
        return new Balls(color,numberofBall);
    }

}
