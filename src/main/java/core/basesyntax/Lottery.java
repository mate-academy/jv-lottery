package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.getRandomColor();

        return newBall;
    }
}
