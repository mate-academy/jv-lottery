package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            balls.add(lottery.getRandomBall());
        }

        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i) != null) {
                System.out.println(balls.get(i));
            } else {
                System.out.println("Ball " + (i + 1) + " is null.");
            }
        }
    }
}
