package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor() {
        color = colorSupplier.getRandomColor();
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color= '" + color + '\''
                + ", number=" + number + '\''
                + '}';
    }
}
