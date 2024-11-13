package core.basesyntax;
public class Ball {
    String color;
    int number;
@Override
public String toString() {
    return "Color: " + color + ", number" + number;
}
public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}

/*public class Ball {
    private String color;
    private int number;

    // Конструктор класу Ball
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball {color='" + color + "', number=" + number + "}";
    }
}
public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}*/
