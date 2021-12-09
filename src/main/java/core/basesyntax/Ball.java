package core.basesyntax;

public class Ball  extends Application {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Ball{" +
                "color='" + getRandomColor() + '\'' +
                ", number=" + getRandomBall() +
                '}';
    }
}
