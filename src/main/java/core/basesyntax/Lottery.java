package core.basesyntax;

public class Lottery {
    ColorSupplier cs = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.color = cs.getRandomColor();
        ball.number = getRandomNumber();
        return ball;
    }

    private int getRandomNumber() {
        double r = Math.random();        // [0, 1)
        double r1 = r * (100 + 1); // [0, to - from)
        double r2 = r1 + 0;           // [from .. to + 1)
        return (int) r2;
    }

}
