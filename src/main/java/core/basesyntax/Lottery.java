package core.basesyntax;

public class Lottery {
    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}
