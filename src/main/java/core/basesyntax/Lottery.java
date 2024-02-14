package core.basesyntax;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private Ball ball = new Ball();

    public String getRandomBall() {
        return color.getRandomColor() + " " + ball.getRandomNumber();
    }
}
