package core.basesyntax;

public class Ball {
    private String color;
    private int age;

    public Ball(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", age=" + age
                + '}';
    }
}
