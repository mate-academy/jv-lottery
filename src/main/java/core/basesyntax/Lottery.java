package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        Colors randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }

    public static void printThreeRandomBalls() {
        System.out.println("Three Random Balls:");
        for (int i = 0; i < 3; i++) {
            Ball ball = getRandomBall();
            System.out.println(ball);
        }
    }
}
