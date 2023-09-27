package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    private final Random random = new Random();

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Сolor: " + color;
    }

    public int getRandomNumber() {
        return number = random.nextInt(100);
    }
}
