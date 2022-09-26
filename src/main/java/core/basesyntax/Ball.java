package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color.toString();
    }

    public int getNumber() {
        return number;
    }

    public String printBall() {
        String out = "Ball : " + getColor() + (" ") + getNumber();
        System.out.println(out);
        return out;
    }

    public String toString() {
        return null;
    }



}
