package core.basesyntax;

import java.util.stream.IntStream;

public class Application {
    private static final int ZERO = 0;
    private static final int THREE = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        IntStream.range(ZERO, THREE).forEach(i -> System.out.println(lottery.getRandomBall()));
    }
}
