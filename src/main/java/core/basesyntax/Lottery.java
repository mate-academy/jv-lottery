package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = (int) (Math.random() * 100) + 1;
        return new Ball(color, number);
    }
}
