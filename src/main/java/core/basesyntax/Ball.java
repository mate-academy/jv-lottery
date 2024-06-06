package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getRandomNumber() {
        int num = new Random().nextInt(100);
        this.setNumber(num);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }

}
