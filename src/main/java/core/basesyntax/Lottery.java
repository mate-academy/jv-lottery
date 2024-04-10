package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int randomIndex = randomNumber.nextInt(101);
        String randomColor = String.valueOf(getRandomColor());
        Ball ball = new Ball(randomColor, randomIndex);
        return ball;
    }

    public void getThreeRandomBalls() {
        System.out.println("Three Random Balls:");
        for (int i = 0; i < 3; i++) {
            Ball ball = getRandomBall();
            System.out.println(ball);
        }
    }
}
