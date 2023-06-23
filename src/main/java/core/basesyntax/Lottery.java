package core.basesyntax;

public class Lottery {
    public Ball getRandomBall(String color, int number) {
        return new Ball(color, number);
    }
}
