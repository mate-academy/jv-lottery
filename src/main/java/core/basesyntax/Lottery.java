package core.basesyntax;

public class Lottery {
    private Ball randomBall = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int boundIndex = 100;

    public Ball getRandomBall() {
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(colorSupplier.getRandom().nextInt(boundIndex));
        return randomBall;
    }

    public int getBoundIndex() {
        return boundIndex;
    }

    public void setRandomBall(Ball randomBall) {
        this.randomBall = randomBall;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

}
