package core.basesyntax;

import java.util.Random;


public class ColorSupplier {
    public ColorDiff getRandomColor() {
        ColorDiff[] clr = ColorDiff.values();
        Random random = new Random();
        int n = random.nextInt(7);
     //   ColorDiff randomColor = clr[n];
      // String[] color2 = new String[] {"red", "orange", "yellow", "green", "blue", "indigo", "violet" };
        return clr[n];
        }
    }

