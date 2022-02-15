package core.basesyntax;

public class Ball extends ColorSupplier {
private int number;
private Colors color;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Number: ")
                .append(number)
                .append("color: ")
                .append(color);
        return builder.toString();
    }
}
