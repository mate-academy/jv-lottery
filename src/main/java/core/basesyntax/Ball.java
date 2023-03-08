package core.basesyntax;

import java.util.Random;

public class Ball {
    String color = new ColorSupplier().getRandomColor();
    int number=new Random().nextInt(100);
    @Override
    public String toString() {
        return "Color is: " + color + "; Number is: "+ number;
    }
}
