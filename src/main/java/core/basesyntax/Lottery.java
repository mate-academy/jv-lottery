package core.basesyntax;

import  java.util.Random;

public class Lottery extends Ball{

    public String getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        Random randNumber = new Random();
        int number = randNumber.nextInt(100) + 1;
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball.toString();
    }
}
