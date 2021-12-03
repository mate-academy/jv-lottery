package core.basesyntax;

public class Ball {
    private String color;

    private int number;

    public Ball(int a, String x) {
        this.number = a;
        this.color = x;
        // add init of color
        //установить начальное значение для атрибута
    }

    public Ball() {
    }

    public static void ball(String[] color) {
        Ball ball = new Ball();
    }

    @Override
    public String toString() {
        return "color " + this.color + "number " + this.number;
    }
}
