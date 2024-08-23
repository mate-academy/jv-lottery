package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        Ball randomBall = new Ball();
        final int MaxValue = 100;
        ColorSupplier randomColor = new ColorSupplier();

        randomBall.setNumber((int) (Math.random() * MaxValue));
        randomBall.setColor(randomColor.getRandomColor());

        return randomBall.getColor() + " " + randomBall.getNumber();
    }
}
