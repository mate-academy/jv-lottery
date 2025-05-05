package core.basesyntax;

public class Ball {
    private String color;
    private Integer number;

    public Ball(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", number=" + number + '}';
    }
}
