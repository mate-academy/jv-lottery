package core.basesyntax;

public class Lottery {
    ColorSupplier color = new ColorSupplier();
    Ball ball = new Ball();

    String getRandomBall() {
        return color.getRandomColor() + " " + ball.getRandomNumber();
    }
}
