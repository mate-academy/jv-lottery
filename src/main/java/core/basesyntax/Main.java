package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ColorSopplier colorSopplier = new ColorSopplier();
        Lottery lottery = new Lottery("" + colorSopplier.getRandomColor(),
                new Random().nextInt(100));
        System.out.println(lottery);
    }
}


