package core.basesyntax;

enum Colors{
    RED,
    GREEN,
    BLACK,
    WHITE,
    ORANGE,
    YELLOW,
    PURPLE,
    PINK
}

public class Ball{
    String color;
    int number;

    public String toString(){
        System.out.println(color + String.valueOf(number));
        return color + String.valueOf(number);
    }
}