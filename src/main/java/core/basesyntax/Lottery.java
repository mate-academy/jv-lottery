package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),(int)(Math.random() * 101));
    }

}
