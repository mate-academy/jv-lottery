package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String colour, int number) {
        this.color = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball colour >> " + color + " <<" + " Ball number >> " + number + " <<";
    }
}
//создать класс Ball со следующими полями: цвет и номер и переопределить метод toString ()
