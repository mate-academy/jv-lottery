package core.basesyntax;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.getNumber();
        newBall.getColor();
        return newBall;
    }
}
