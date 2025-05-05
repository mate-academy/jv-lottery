package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.color).append(" ball ").append('#').append(this.number);
        return str.toString();
    }
}
