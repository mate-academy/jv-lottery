package core.basesyntax;

public class Lottery {
    public static Ball getRandomBall(String color, int number) {
        return new Ball(color, number);
    }
}
