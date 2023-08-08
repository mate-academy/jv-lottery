package core.basesyntax;

public class Ball {
    private Color color;
    private int number;
    private final StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String toString() {

        return stringBuilder
                .append("Ball's number: ").append(number)
                .append("\nIt's color: ").append(color).toString();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
