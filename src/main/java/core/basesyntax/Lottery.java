package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor();
        randomBall.setNumber();
        return randomBall;
    }
}
