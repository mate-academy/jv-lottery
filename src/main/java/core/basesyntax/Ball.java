package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball(Color randomColor, int randomNumber) {
        this.color = randomColor.name();
        this.number = randomNumber;
    }

    public String toString() {
        return "Ball color = " + color + " Ball number = " + number;
    }
}
