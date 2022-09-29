package core.basesyntax;


import java.util.Random;


public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int number = random.nextInt(100);
        ball.setNumber(number);
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;
    }
}