package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }

    public static void main(String[] args) {

        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
