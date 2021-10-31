package core.basesyntax;
import java.util.Random;

public class Ball {
    public int number() {
        return new Random().nextInt(100);
    }

    public String color(){
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    public String toString(){
        return "Color: " + color() + " and Number: " + number() + "\n";
    }
}
