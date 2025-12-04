package task;

public class Ball {

    public enum Color {
        PINK,
        YELLOW,
        BLUE,
        CYAN,
        PURPLE,
        BROWN,
        GREEN,
        ORANGE,
        RED,
        TEAL
    }

    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

}
