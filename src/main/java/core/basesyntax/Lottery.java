package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier randomColor = new ColorSupplier();

        randomBall.setNumber((int) (Math.random() * 100));
        randomBall.setColor(randomColor.getRandomColor());

        return randomBall.getColor() + " " + randomBall.getNumber();
    }
}
