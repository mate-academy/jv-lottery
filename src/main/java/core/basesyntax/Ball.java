package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public Ball() {

    }

    public Ball(Colors randomColor) {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
