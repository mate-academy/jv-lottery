package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private Integer number;

    public Ball(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        String text;
        switch (new Random().nextInt(2)) {
            default:
            case 0:
                text = "You got a new ball with ";
                break;
            case 1:
                text = "A strange sphere appeared before you with ";
                break;
            case 2:
                text = "You have won a ball with ";
                break;
        }

        return text + color + " color " + "and number - " + number.toString() + " on it";
    }
}
