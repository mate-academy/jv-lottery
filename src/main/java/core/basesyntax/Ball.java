package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setBall(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\''
                + ", number=" + number + '}';
    }
}

