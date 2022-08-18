package core.basesyntax;

public class Ball extends Lottery {

   public String color;
   public int number;

    public Ball() {}

    public Ball(String color,int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
