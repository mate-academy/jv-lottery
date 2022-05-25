package core.basesyntax;

public enum Color {
    BLACK("black"), YELLOW("yellow"), RED("red"), GREEN("green"), WHITE("white"), ORANGE("orange");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
