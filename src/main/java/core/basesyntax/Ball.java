package core.basesyntax;

public class Ball {
    private String name;
    private String color;

    public Ball(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
