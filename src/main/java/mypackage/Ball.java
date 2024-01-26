package mypackage;

public class Ball {
    private String color;
    private int number;

    public Ball(String randomColor, int randomNumber) {
        this.color = randomColor;
        this.number = randomNumber;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
