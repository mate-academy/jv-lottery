package core.basesyntax;

import ball.characteristics.Ball;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < 3; i++) {
            Lottery lottery = new Lottery();
            Ball ball = new Ball(lottery.getRandomBall());
            System.out.println(ball.toString());
        }
    }
}
