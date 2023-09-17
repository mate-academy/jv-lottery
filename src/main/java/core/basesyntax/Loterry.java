package core.basesyntax;

public class Loterry {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        int randomNumber = ball.getRandomNumber();
        ball.setNumber(randomNumber);
        return ball;
    }
}
