package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        Lottery newLoterry = new Lottery();
        number = newLoterry.getRandomBall();

        ColorSupplier newColor = new ColorSupplier();
        color = newColor.getRandomColor();

        return number + " " + color;
    }
}
