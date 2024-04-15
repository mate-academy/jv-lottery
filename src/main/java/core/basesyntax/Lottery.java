package core.basesyntax;

public class Lottery {

    public static Ball getRandomBall(Colors color, int number) {

        return new Ball(color, number);
    }
}
