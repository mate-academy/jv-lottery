package core.basesyntax;

public class Ball {
   public  String color;
   public  int number;

    public Ball(Colors color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return "number - " + number +  "  " + "color - " + color;
    }
}
