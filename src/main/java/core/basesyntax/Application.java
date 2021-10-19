package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(java.lang.String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        List<Ball> allBals = new ArrayList<>();
        allBals.add(ball1);
        allBals.add(ball2);
        allBals.add(ball3);

        allBals.forEach(System.out::println);
    }
}
