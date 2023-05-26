package core.basesyntax;

import java.util.Random;

public class Application {
    public Ball getRandomBall() {
        Random rand = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = rand.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }

    public static void main(String[] args) {
        Application ap = new Application();
        Ball[] balls = new Ball[10];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = ap.getRandomBall();
            System.out.println(balls[i]);
        }
    }

}
