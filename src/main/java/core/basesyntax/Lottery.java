package core.basesyntax;

public class Lottery {
    ColorSupplier color = new ColorSupplier();

    Ball number = new Ball();

    public String getRandomBall() {
        return color.getRandomColor() + " " + number.getRandomNumber();
    }
}
