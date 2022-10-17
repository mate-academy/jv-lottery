package core.basesyntax;

public class Ball {
    final private String color;
    final private int number;

    public Ball(String color, int number){
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Color" + color + ", Number: " + number;
    }

}
