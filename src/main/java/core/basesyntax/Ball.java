package core.basesyntax;

public class Ball {
    private String name;
    private int number;

    public Ball(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "name='" + name + '\''
                + ", number=" + number
                + '}';
    }
}
