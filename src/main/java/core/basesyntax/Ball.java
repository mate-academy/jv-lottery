package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setBall(Colors color, int number) {
        this.color = color.name();
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }

    public enum Colors {
        WHITE, BLACK, YELLOW, BLUE, RED, GREEN, BROWN
    }
}
