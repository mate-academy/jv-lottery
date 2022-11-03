package core.basesyntax;

public class Ball extends Lottery {
    private String color;
    private int number;
     public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball(){

    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number +'}';
    }
}
