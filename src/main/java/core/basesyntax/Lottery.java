package core.basesyntax;

public class Lottery {

    public Ball getRandomBall() {
        int num = ColorSupplier.random.nextInt(100);
        String color = new ColorSupplier().getRandomColor();

        return new Ball(color,num);
    }
}
