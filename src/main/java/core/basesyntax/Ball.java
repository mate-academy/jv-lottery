package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.number = number;
        this.color = color;
    }

//    public String getColor() {
//        return color;
//    }
//
//    public int getNumber() {
//        return number;
//    }

    @Override
    public String toString() {
        return "Ball{"
                + "Color='" + color + '\''
                + ", number='" + number + '\''
                + '}';
    }
}
