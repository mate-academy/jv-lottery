package core.basesyntax;

public class Lottery {
    private int randomNumber;
    private String randomColor;

    public Ball getRandomBall() {
        return new Ball(getRandomNumber(),getRandomColor());
    }

    private void setRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.randomColor = colorSupplier.getRandomColor();
    }

    private void setRandomNumber() {
        NumberSupplier numberSupplier = new NumberSupplier();
        this.randomNumber = numberSupplier.getRandomNumber();
    }

    private int getRandomNumber() {
        setRandomNumber();
        return randomNumber;
    }

    private String getRandomColor() {
        setRandomColor();
        return randomColor;
    }
}
