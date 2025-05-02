package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[]{lottery.getRandomBall(), lottery.getRandomBall(),
                lottery.getRandomBall()};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
