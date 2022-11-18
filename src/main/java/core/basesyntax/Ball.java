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
        StringBuilder stringBuilder = new StringBuilder()
                .append("Color: ")
                .append(this.color)
                .append(", ")
                .append("Number: ")
                .append(this.number)
                .append(".");
        return String.valueOf(stringBuilder);
    }
}
