package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final Lottery LOTTERY = new Lottery();

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            balls.add(LOTTERY.getRandomBall());
        }

        balls.forEach(System.out::println);
    }
}
