package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[] {lottery.getRandomBall(), lottery.getRandomBall(),
                lottery.getRandomBall()};
        Arrays.stream(balls).forEach(System.out::println);
    }
}
