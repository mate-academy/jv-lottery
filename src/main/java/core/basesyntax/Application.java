package core.basesyntax;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        IntStream.range(0, 3)
                .forEach((i) -> System.out.println(i + ": " + Lottery.getRandomBall()));
    }
}
