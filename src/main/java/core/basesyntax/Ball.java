package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setBall(Color color, int number) {
        this.color = color.name();
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }
}
