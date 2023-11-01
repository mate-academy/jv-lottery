package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        int index = new Random().nextInt(Colors.values().length);
        String color = Colors.values()[index].toString();
        randomBall.setColor(color);
        Random random = new Random();
        int number = random.nextInt(100);
        randomBall.setNumber(number);
        return randomBall;
    }
}
