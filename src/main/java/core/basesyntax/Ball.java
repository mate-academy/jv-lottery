package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        NumberSupplier numberSupplier = new NumberSupplier();
        this.number = numberSupplier.getRandomNumber();
    }

    @Override
    public String toString() {
        return "Ball{ "
                + "color: " + getColor() + ",\n"
                + " number: " + getNumber()
                + "}";
    }
}
