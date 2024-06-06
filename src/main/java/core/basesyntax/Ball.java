package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void getRandomNumber() {
        int num = new Random().nextInt(100);
        this.setNumber(num);
    }

    public String toString() {
        return "The " + getRandomColor() + " ball with a " + number + " number!";
    }

}
