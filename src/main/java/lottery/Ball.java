package lottery;

public class Ball {
    //fields: color and number and override toString() method

    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball color is: "
                + color
                + ";"
                + " Ball number is: "
                + number
                + "\n";
    }
}
