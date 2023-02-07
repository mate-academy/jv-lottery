package core.basesyntax;

import core.balls.Ball;
import core.colors.ColorSupplier;
import core.lottery.Lottery;
    
public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Got " + lottery.getRandomBall().toString());
        }
    }
}
