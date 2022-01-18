package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String a = "";
        switch (new Random().nextInt(6)) {
            case 0:
                a = "" + Colors.Red;
                break;
            case 1:
                a = "" + Colors.Yellow;
                break;
            case 2:
                a = "" + Colors.Green;
                break;
            case 3:
                a = "" + Colors.Blue;
                break;
            default:
                a = "" + Colors.White;
        }
        return a;
    }
}
