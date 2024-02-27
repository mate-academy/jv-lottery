package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    int numberofBall = new Random().nextInt(100);
    public Balls getRandomBall(String color, int numberofBall) {
        this.numberofBall = numberofBall;
        color = getRandomColor();
        return new Balls(color,numberofBall);
    }

}
