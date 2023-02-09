package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
	}

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
	}

    public void setNumber(int number) {
        this.number = number;
	}

    public int getNumber() {
        return number;
	}

    public String getColor() {
        return color;
	}

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
