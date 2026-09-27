package core.basesyntax;

import model.Ball;
import model.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
